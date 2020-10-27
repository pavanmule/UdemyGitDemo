package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Test(dependsOnMethods= {"carLoanLogout"})
	public void Homepage() {
		System.out.println("Home page two");
	}
	@Test(groups= {"smoke"})
	public void carLoan() {
		System.out.println("Home page");
	}
	@Test(enabled=false)
	public void carLoanLogin() {
		System.out.println("Login page");
		
	}
	
	@Test
	public void carLoanLogout() {
		System.out.println("LogOut page");
		Assert.assertTrue(false);
		
	}

}
