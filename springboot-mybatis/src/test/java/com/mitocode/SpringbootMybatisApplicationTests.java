package com.mitocode;


import org.springframework.util.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Test
	void contextLoads() {
		Assert.state(2>1, "Claro que si Mascota");
	}

}
