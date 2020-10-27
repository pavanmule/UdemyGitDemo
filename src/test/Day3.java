package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Test(dataProvider="getData")
	public void TwoWheeler(String username,String password) {
		System.out.println("TwoWheeler HomePage ");
		System.out.println( username);
		System.out.println( password);
		
	}
	@Parameters({"URL"})
	@Test
	public void TwoWheelerLogin(String name) {
		System.out.println("TwoWheeler Login ");
		System.out.println(name);
		
	}
	@Test(groups= {"smoke"})
	public void TwoWheelerLogOut() {
		System.out.println("TwoWheeler Logout ");
		
	}
	@DataProvider
	public Object[][] getData() {
		//first combination username password--good credit history now
		//2nd combination username password no credit
		//3rd combination no hiestory
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="username1";
		data[0][1]="password1";
		//2nd set
		data[1][0]="username2";
		data[1][1]="password2";
		//3rd set
		data[2][0]="username3";
		data[2][1]="password3";
		return data;
	}

}
