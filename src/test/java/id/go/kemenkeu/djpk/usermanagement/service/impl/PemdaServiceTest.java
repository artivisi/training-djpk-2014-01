/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.kemenkeu.djpk.usermanagement.service.impl;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author endy
 */
@ContextConfiguration(locations = "classpath*:id/go/kemenkeu/djpk/**/konfigurasi-spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PemdaServiceTest {
    
    @Autowired
    private UserManagementService ums;
    
    @Autowired private DataSource dataSource;
    
    @BeforeClass
    public static void inisialisasi(){
        System.out.println("Menjalankan inisialisasi");
    }
    
    @Before
    public void sebelumTest() throws Exception {
        System.out.println("Kosongkan tabel pemda");
        String sql = "delete from tpemda";
        Connection conn = dataSource.getConnection();
        conn.createStatement().executeUpdate(sql);
        conn.close();
    }
    
    @After
    public void setelahTest(){
        System.out.println("Setelah test");
    }
    
    @AfterClass
    public static void bersihBersih(){
        System.out.println("Menjalankan bersih-bersih");
    }
    
    @Test
    public void testInsertPemda(){
        System.out.println("Test Insert Pemda");
        //Simpan biasa
        Pemda p = new Pemda();
        
        p.setKode("P-000");
        p.setKodeSatuanKerja("ABC");
        p.setUraian("Pemda Tester");
        p.setUraianSingkat("Tester");
        
        Assert.assertNull(p.getId());
        ums.simpan(p);
        Assert.assertNotNull(p.getId());
    }
    
    @Test
    public void testInsertBanyak() throws Exception {
        //Simpan banyak
        List<Object> daftarPemda = new ArrayList<Object>();
        Pemda p = new Pemda();
        p.setKode("P-001");
        p.setKodeSatuanKerja("ABC0");
        p.setUraian("Pemda Tester");
        p.setUraianSingkat("Tester");
        daftarPemda.add(p);
        
        Pemda p1 = new Pemda();
        p1.setKode("P-002");
        p1.setKodeSatuanKerja("ABC1");
        p1.setUraian("Pemda Tester");
        p1.setUraianSingkat("Tester");
        daftarPemda.add(p1);
        
        Pemda p2 = new Pemda();
        p2.setKode("P-003");
        p2.setKodeSatuanKerja("ABC2");
        p2.setUraian("Pemda Tester");
        p2.setUraianSingkat("Tester");
        daftarPemda.add(p2);
        
        ums.simpanBanyak(daftarPemda);
        
        String sqlCek = "select count(*) from tpemda";
        Connection conn = dataSource.getConnection();
        
        ResultSet rs = conn.createStatement().executeQuery(sqlCek);
        Assert.assertTrue(rs.next());
        
        Long count = rs.getLong(1);
        Assert.assertEquals(new Long(3), count);
        
        rs.close();
        conn.close();
    }
}
