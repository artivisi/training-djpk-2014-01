package id.go.kemenkeu.djpk.usermanagement;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:id/go/kemenkeu/djpk/**/konfigurasi-spring.xml");
        ctx.registerShutdownHook();
    }
}
