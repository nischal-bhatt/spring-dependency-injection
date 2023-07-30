package spring.di.nish;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController
				= applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
		System.out.println(myController.sayHello());
	}

	@Test
	void testAutowiredController() {

		System.out.println(myController.sayHello());

	}

}
