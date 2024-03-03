package SurlelacpageObjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utilities.BaseClass;
import utilities.ExtentManager;


public class Footerpage extends BaseClass {

	@FindBy(xpath="//a[@href='/collections/all']")
	WebElement Shoplink; 
	
	@FindBy(xpath="//small[contains(@class,'copyright__content')]")
	WebElement scrollpage; 
	
	@FindBy(xpath="//input[@id='NewsletterForm--footer']")
	WebElement emailinpt;
	
	@FindBy(xpath="//span[text()='Subscribe']")
	WebElement subBtn;
	
	@FindBy(xpath="//div[contains(@class,'footermenu-newdesign')]//a[@href='/pages/privacy-policy']")
	WebElement pripolylink;
	
	@FindBy(xpath="//div[contains(@class,'footermenu-newdesign')]//a[@href='https://www.instagram.com/SURLELAC/']")
	WebElement instalink;
	
//	@FindBy(xpath="//div[contains(@class,'footermenu-newdesign')]//a[@href='https://www.tiktok.com/@surlelac.co?_t=8V6eFkokSvz&_r=1']")
//	WebElement tiklink;
	
	@FindBy(xpath="//div[contains(@class,'footer__copyright')]//a[@href='https://yourportalonline.com/']")
        WebElement pwdlink;
	
	public Footerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean Shoplink()
	{
		try {
			Shoplink.click();
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
	
	public boolean scrollpage()
	{
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", scrollpage);
			BaseClass.log().info("It Scroll the WebPage");
			ExtentManager.test.log(Status.PASS, "It Scroll the WebPage");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "It Scroll the WebPage");
			return false;
		}
	}
	
	public boolean emailinpt()
	{
		try {
			Thread.sleep(2000);
			emailinpt.click();
			Actions act = new Actions(driver);
			act.sendKeys("adnanmohammad8900gmail.com");
			act.keyDown(Keys.ARROW_DOWN).build().perform();
			BaseClass.log().info("Clicked on email input box");
			ExtentManager.test.log(Status.PASS, "Clicked on email input box");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on email input box");
			return false;
		}
	}
	
	public boolean subscibebtn()
	{
		try {
			subBtn.click();
			BaseClass.log().info("Clicked on Subscribe button");
			ExtentManager.test.log(Status.PASS, "Clicked on Subscribe button");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Subscribe button");
			return false;
		}
	}
	
	public boolean priPolicy()
	{
		try {
			pripolylink.click();
			BaseClass.log().info("Clicked on privacy policy link");
			ExtentManager.test.log(Status.PASS, "Clicked on policy link");
			driver.navigate().back();
			Thread.sleep(2000);
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on policy link");
			return false;
		}
	}
	
	public boolean instaBtn()
	{
		try {
			instalink.click();
			BaseClass.log().info("Clicked on Instagram link");
			ExtentManager.test.log(Status.PASS, "Clicked on Instagram link");
			driver.navigate().back();
			Thread.sleep(1000);
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Instagram link");
			return false;
		}
	}
	
	public boolean pwdlink()
	{
		try {
			Thread.sleep(2000);
			pwdlink.click();
			BaseClass.log().info("Clicked on pwd link");
			ExtentManager.test.log(Status.PASS, "Clicked on pwd link");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on pwd link");
			return false;
		}
	}
	
}
