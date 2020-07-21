package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest	
public class TestGreeting {
GreetingApp ga =new GreetingApp();

@Test
public void testcheck_empty()
{
	
	
	Assertions.assertEquals("Hello Sowmya welcome!",ga.processForm("Sowmya",""));
}

@Test
public void testcheck_on()
{
	
	
	Assertions.assertEquals("Hello Sowmya welcome!",ga.processForm("Sowmya","on"));
}

@Test
public void testcheck_null()
{
	
	
	Assertions.assertEquals("Hello Sowmya checkiton!",ga.processForm("Sowmya",null));
}

}
