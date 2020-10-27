package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeClass
	public void bfclass()
	{
		System.out.println("before class test3");
	}
	
	@BeforeMethod
	public void BeforMethod() {
		System.out.println("before methode evry test i will in test3 class");
	}
	@Test
	public void WebLoginCarLoan() {
		System.out.println("weblogincar1");
	}
	@Test
	public void MobLoginCarLoan() {
		System.out.println("moblogincar3");
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("i am first good");
	}
	@Test
	public void MobLopginCarLoan() {
		System.out.println("moblogincar2");
	}
	@AfterMethod
	public void after() {
		System.out.println("after method test class3");
	}
	@Test
	public void MobLopoginCarLoan() {
		System.out.println("moblogincar4");
	}
	@Test
	public void APILoginCarLoan() {
		System.out.println("apilogicar");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class test3");
	}
	

}
