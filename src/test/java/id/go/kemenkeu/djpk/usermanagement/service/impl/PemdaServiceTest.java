/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.go.kemenkeu.djpk.usermanagement.service.impl;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
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
    
    @BeforeClass
    public static void inisialisasi(){
        System.out.println("Menjalankan inisialisasi");
    }
    
    @Before
    public void sebelumTest(){
        System.out.println("Sebelum Test");
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
    public void testKedua(){
        System.out.println("Test Kedua");
    }
}
