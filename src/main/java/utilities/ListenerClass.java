package utilities;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;  
import org.testng.ITestListener;  
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;  

public class ListenerClass extends ExtentManager implements ITestListener 
{
	//public WebDriver driver=null;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		test=extent.createTest(result.getMethod().getDescription());
	}

	public void onTestSuccess(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"Pass TestCase : "+result.getName());
		}
	}

	public void onTestFailure(ITestResult result)
	{
		 //Convert web driver object to TakeScreenshot
//		BrowserSetup bt = new BrowserSetup();
        TakesScreenshot scrShot =(TakesScreenshot) BaseClass.driver;

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); 
        
//        String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timeString = "./screenshots/"+sdf1.format(timestamp)+" - Scrshot1.png";
        File DestFile=new File(timeString);
        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        //Screenshot with log report.
        if (result.getStatus() == ITestResult.FAILURE) 
		{
			try {
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				
				test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+sdf1.format(timestamp)+" - Scrshot1.png");
				
				//test.log(Status.FAIL, (Markup) test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+result.getName()+" Failed"+".png"));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void onTestSkipped(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Skipped Test Case is : "+result.getName());
		}
		
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
	

}
