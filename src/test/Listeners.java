package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNg listeners

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("i successfully passed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("i failed "+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	@Override
	public void onFinish(ITestContext context)
	{
		
	}
	

	
}
