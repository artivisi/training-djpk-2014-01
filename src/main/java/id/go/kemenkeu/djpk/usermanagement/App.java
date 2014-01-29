package id.go.kemenkeu.djpk.usermanagement;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        AbstractApplicationContext ctx 
                = new ClassPathXmlApplicationContext("classpath:id/go/kemenkeu/djpk/**/konfigurasi-spring.xml");
        ctx.registerShutdownHook();
        
        UserManagementService ums = (UserManagementService) ctx.getBean("userManagementService");
        
        List<Object> daftarPemda = new ArrayList<Object>();
        Pemda p = new Pemda();
        p.setKode("P-001");
        p.setKodeSatuanKerja("ABC");
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
        
        // id sudah terisi
        System.out.println("ID baru : "+p.getId());
        
        System.out.println("Idle 10 detik");
        Thread.sleep(10 * 1000);
    }
}
