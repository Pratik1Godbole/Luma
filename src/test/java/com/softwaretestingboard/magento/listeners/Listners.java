package com.softwaretestingboard.magento.listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
	
	
	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("All the test cases got finished.");
	}
	
	@Override		
    public void onStart(ITestContext Result) {					
        // TODO Auto-generated method stub				
        	System.out.println("first test cases started.");	
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("Test failed but within success percentage: " + Result.getName());
    }		

    @Override		
    public void onTestFailure(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("The name of the test case is failed: "+Result.getName());
    }		

    @Override		
    public void onTestSkipped(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		System.out.println("The name of the testcase is skipped: "+ Result.getName());
    }		

    @Override		
    public void onTestStart(ITestResult Result) {					
        // TODO Auto-generated method stub				
        System.out.println(Result.getName()+"test case started");		
    }		

    @Override		
    public void onTestSuccess(ITestResult Result) {					
        // TODO Auto-generated method stub				
        	System.out.println("The name of the test case is passed: "+Result.getName());	
    }	

}
