package id.go.kemenkeu.djpk.usermanagement;

import id.go.kemenkeu.djpk.usermanagement.domain.Pemda;
import id.go.kemenkeu.djpk.usermanagement.service.UserManagementService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:id/go/kemenkeu/djpk/**/konfigurasi-spring.xml");
        ctx.registerShutdownHook();
        
        UserManagementService ums = (UserManagementService) ctx.getBean("userManagementService");
        
        Pemda p = new Pemda();
        p.setKode("P-001");
        p.setKodeSatuanKerja("ABC");
        p.setUraian("Pemda Tester");
        p.setUraianSingkat("Tester");
        
        ums.simpan(p);
        
        System.out.println("Idle 10 detik");
        Thread.sleep(10 * 1000);
    }
}
