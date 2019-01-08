package home.vimal.sb;

import home.vimal.sb.hello.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class) tells JUnit to run using Spring’s testing support. SpringRunner is the new name for SpringJUnit4ClassRunner, it’s just a bit easier on the eye.
@RunWith(SpringRunner.class)
//@SpringBootTest is saying “bootstrap with Spring Boot’s support” (e.g. load application.properties and give me all the Spring Boot goodness)
@SpringBootTest(classes = HelloWorld.class)
public class SpringTestFirstSbAppTests {

	@Test
	public void testContextLoads() throws Exception {
	}

}
