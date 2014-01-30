/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.kemenkeu.djpk.usermanagement.service.impl;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.domain.Tprov;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.CompositeDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
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
@RunWith(SpringJUnit4ClassRunner.class) //agar contextconfig dijalankan
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
        Connection conn = dataSource.getConnection();
        
        IDataSet[] daftarDataset = new IDataSet[]{
                new FlatXmlDataSetBuilder().build(new File("src/test/resources/sample-pemda.xml"))
        };
        
        DatabaseOperation.CLEAN_INSERT
                .execute(new DatabaseConnection(conn), new CompositeDataSet(daftarDataset));
        
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
    public void testCariById(){
        Pemda p = ums.cariById(99);
        Assert.assertNotNull(p);
        
        Assert.assertNull(ums.cariById(1001));
    }
    
    @Test
    public void testInsertPemda(){
        Tprov prov = new Tprov();
        prov.setId(99);
        
        System.out.println("Test Insert Pemda");
        //Simpan biasa
        Pemda p = new Pemda();
        
        p.setKode("P-000");
        p.setKodeSatuanKerja("ABC");
        p.setUraian("Pemda Tester");
        p.setUraianSingkat("Tester");
        p.setProvinsi(prov);
        
        Assert.assertNull(p.getId());
        ums.simpan(p);
        Assert.assertNotNull(p.getId());
    }
    
    @Test
    public void testInsertBanyak() throws Exception {
        Tprov prov = new Tprov();
        prov.setId(99);
        
        //Simpan banyak
        List<Object> daftarPemda = new ArrayList<Object>();
        Pemda p = new Pemda();
        p.setKode("P-001");
        p.setKodeSatuanKerja("ABC0");
        p.setUraian("Pemda Tester");
        p.setUraianSingkat("Tester");
        p.setProvinsi(prov);
        daftarPemda.add(p);
        
        Pemda p1 = new Pemda();
        p1.setKode("P-002");
        p1.setKodeSatuanKerja("ABC1");
        p1.setUraian("Pemda Tester");
        p1.setUraianSingkat("Tester");
        p1.setProvinsi(prov);
        daftarPemda.add(p1);
        
        Pemda p2 = new Pemda();
        p2.setKode("P-003");
        p2.setKodeSatuanKerja("ABC2");
        p2.setUraian("Pemda Tester");
        p2.setUraianSingkat("Tester");
        p2.setProvinsi(prov);
        daftarPemda.add(p2);
        
        ums.simpanBanyak(daftarPemda);
        
        String sqlCek = "select count(*) from tpemda";
        Connection conn = dataSource.getConnection();
        
        ResultSet rs = conn.createStatement().executeQuery(sqlCek);
        Assert.assertTrue(rs.next());
        
        Long count = rs.getLong(1);
        Assert.assertEquals(new Long(4), count);
        
        rs.close();
        conn.close();
    }
    
    @Test
    public void testCariPemdaPakaiSpring(){
        List hasil = ums.getPemdaPakeSpring();
        Assert.assertTrue(hasil.size() == 1);
    }
}
