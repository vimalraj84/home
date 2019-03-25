package home.vimal.sb.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import home.vimal.sb.service.HelloWorldService;

//TODO: Not working for two spring boot application classes.

//@SpringBootApplication annotation to mark the main class of a Spring Boot application
//@SpringBootApplication encapsulates @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.
@SpringBootApplication //or use @Configuration @EnableAutoConfiguration @ComponentScan
//@EnableDiscoveryClient
public class HelloWorld implements CommandLineRunner {

	// Simple example shows how a command line spring application can execute an
	// injected bean service. Also demonstrates how you can use @Value to inject
	// command line args ('--name=whatever') or application properties
	private final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
	
	@Autowired
	private HelloWorldService helloWorldService;

	@Override
	public void run(String... args) {
		LOG.info(this.helloWorldService.getHelloMessage("Vimalraj"));
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorld.class, args);
	}
}
