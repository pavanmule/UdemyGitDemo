package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGClass {
	@Test
	public void demo()
	{
		System.out.println("hello ");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("i am last");
	}

}
