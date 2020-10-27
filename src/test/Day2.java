package test;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void HomeLoan() {
		System.out.println("HomeLoan HomePage");
	}
	@Test(groups= {"smoke"})
	public void HomeLoanLoginPage() {
		System.out.println("HomeLoan loginPage");
	}
	@Test
	public void HomeLoanLogout() {
		System.out.println("HomeLoan logoutPage");
		
	}
}
