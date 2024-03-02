package SurlelacpageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utilities.BaseClass;
import utilities.ExtentManager;

public class FrontPage extends BaseClass{

	@FindBy(xpath="//a[@href='/collections/all']")
	WebElement shopLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//div[contains(@class,'container')]//a[@href='/pages/look-book']")
	WebElement lookbookLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//a[@href='/pages/events'][1]")
	WebElement eventLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//a[@href='/pages/contact'][1]")
	WebElement contactLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//a[@href='/pages/about'][1]")
	WebElement aboutLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//a[@href='/pages/privacy-policy'][1]")
	WebElement policyLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//a[@href='/search'][1]")
	WebElement searchLink;
	
	@FindBy(xpath="//div[contains(@class,'homenew-bannersection')]//a[@href='/cart'][1]")
	WebElement cartLink;
	
	//Initialize the elements
	public FrontPage()
	{
			PageFactory.initElements(driver, this);
	}
	
	//Perform Operations
	public boolean shop()
	{
		try {
			shopLink.click();
			BaseClass.log().info("Clicked on Shop link");
			ExtentManager.test.log(Status.PASS, "Clicked on Shop link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Shop link");
			return false;
		}
	}
	
	public boolean lookbook()
	{
		try {
			driver.navigate().back();
			lookbookLink.click();
			BaseClass.log().info("Clicked on Lookbook link");
			ExtentManager.test.log(Status.PASS, "Clicked on Lookbook link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Lookbook link");
			return false;
		}
	}
	
	public boolean event()
	{
		try {
			driver.navigate().back();
			eventLink.click();
			BaseClass.log().info("Clicked on EventLink");
			ExtentManager.test.log(Status.PASS, "Clicked on Event link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Event link");
			return false;
		}
	}
	
	public boolean contact()
	{
		try {
			driver.navigate().back();
			contactLink.click();
			BaseClass.log().info("Clicked on ContactLink");
			ExtentManager.test.log(Status.PASS, "Clicked on Contact link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Contact link");
			return false;
		}
	}
	
	public boolean about()
	{
		try {
			driver.navigate().back();
			aboutLink.click();
			BaseClass.log().info("Clicked on AboutLink");
			ExtentManager.test.log(Status.PASS, "Clicked on About link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on About link");
			return false;
		}
	}
	
	public boolean policy()
	{
		try {
			driver.navigate().back();
			policyLink.click();
			BaseClass.log().info("Clicked on PolicyLink");
			ExtentManager.test.log(Status.PASS, "Clicked on Policy link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Policy link");
			return false;
		}
	}
	
	public boolean search()
	{
		try {
			driver.navigate().back();
			searchLink.click();
			BaseClass.log().info("Clicked on SearchLink");
			ExtentManager.test.log(Status.PASS, "Clicked on Search link");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Search link");
			return false;
		}
	}
	
	public boolean cart()
	{
		try {
			driver.navigate().back();
			cartLink.click();
			BaseClass.log().info("Clicked on CartLink");
			ExtentManager.test.log(Status.PASS, "Clicked on Cart link");
			driver.navigate().back();
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Cart link");
			return false;
		}
	}
}
