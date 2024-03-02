package utilities;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



public class BaseClass 
{
	public static WebDriver driver;
	
	@BeforeClass								//executed before any test method
	@Parameters("browser")
	public static void openBrowser(String browser) throws Exception
	{
		if(browser.contains("chrome"))
		{
			driver = new ChromeDriver();
			BaseClass.log().info("Automating on chrome browser");
			
		}else if(browser.contains("edge")) 
		{
			driver = new EdgeDriver();
			BaseClass.log().info("Automating on Edge browser");
		}
			
		//calling method to read property file and passing the key
		driver.get(ReadProperties.readPropertiesData("url"));
		BaseClass.log().info("Website opened: "+ReadProperties.readPropertiesData("url"));
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void closeBrowser()
	{
		driver.quit();
		BaseClass.log().info("Browser closed");
	}
	
	@BeforeSuite
	public void reportGenerate() throws IOException
	{
		ExtentManager.setExtent();
	}
	
	@AfterSuite
	public void endReport()
	{
		ExtentManager.endReport();
	}
	
	public static Logger log()
	{
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}

}
