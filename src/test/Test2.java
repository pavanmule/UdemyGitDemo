package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("good....I am First");
	}
	@Test
	public void test() {
		System.out.println("bye");
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("I am Last not least");
	}

}
