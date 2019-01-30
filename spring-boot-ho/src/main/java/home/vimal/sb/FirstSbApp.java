package home.vimal.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//@SpringBootApplication annotation to mark the main class of a Spring Boot application
//@SpringBootApplication encapsulates @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.
@SpringBootApplication //or use @Configuration @EnableAutoConfiguration @ComponentScan
public class FirstSbApp extends SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(FirstSbApp.class, args);
    }
}