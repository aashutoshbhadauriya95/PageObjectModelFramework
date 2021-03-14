package com.aashu.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aashu.base.TestBase;
import com.aashu.utilities.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class CustomeListeners extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		test=rep.startTest(result.getName().toUpperCase());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.log(LogStatus.PASS, result.getName().toUpperCase()+"Test Passed");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Taking screenshot on failure
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+"Test Failed with exception"+ result.getThrowable());
		
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		
		Reporter.log("Capturing Screenshot");
		
		//Reporter.log("<a target=\"_blank\" href=\"F:\\EclipseWorkSpace\\com.prac.selenium\\src\\test\\resources\\screenshot\\Error.JPG\">Screenhsot</a>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
		
		Reporter.log("<br>");
		
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");
	
		rep.endTest(test);
		rep.flush();
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	

}
