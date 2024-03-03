package SurlelacpageObjects;

//import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;

import utilities.BaseClass;
import utilities.ExtentManager;

public class ShopPage extends BaseClass
{

	//do not use driver.findElement() in Page Object Model
	//elements will be located using @FindBy
	//Locate the elements on Homepage which require action
	
	@FindBy(xpath="//a[@href='/collections/all']")
	WebElement shoplink;
	
	@FindBy(xpath="//header-drawer[@id='window-menu']//summary[contains(@class,'header__icon--menu')]")
	WebElement humbergermenu;
	
	@FindBy(xpath="//header-drawer[@id='window-menu']//details[contains(@class,'menu-opening')]//div[@id='menu-drawer']//a[@href='/collections/all']")
	WebElement shopLink;
	
	@FindBy(xpath="//div[contains(@class,'site-search-cart')]//a[contains(@class,'customsearch')]")
	WebElement searchlink;
	
	@FindBy(xpath="//div[contains(@class,'search-desktop')]")
	WebElement enterinput;
	
	@FindBy(xpath="//li[contains(@class,'grid__item')][1]")
	WebElement selectproduct;
	
	@FindBy(xpath="//div[contains(@class,'product-form__buttons')]//button[contains(@class,'product-form__submit')]")
	WebElement addtocart;
	
	@FindBy(xpath="//form[@id='cart-notification-form']")
	WebElement checkout;
	
	@FindBy(xpath="//div[contains(@class,'_1fragemeg')]//input[@id='email']")
	WebElement inputemail;
	
//	@FindBy(xpath = "//select[@id='Select2']")
//	WebElement shopLink10;
//	
//	@FindBy (xpath = "//h3[text()='Shipping method']")
//    WebElement shopLink11;
	//Initialize the elements
	public ShopPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Perform action on the elements
	public boolean clickOnShopLink1()
	{
		try {
			shoplink.click();
			BaseClass.log().info("Clicked on Shop link1");
			ExtentManager.test.log(Status.PASS, "Clicked on Shop link1");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Shop link1");
			return false;
		}
			
	}
	
	public boolean clickOnShopLink2()
	{
		try {
			humbergermenu.click();
			BaseClass.log().info("Clicked on Humbergermenu");
			ExtentManager.test.log(Status.PASS, "Clicked on Humbergermenu");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Humbergermenu");
			return false;
		}
	}
	
	public boolean clickOnShopLink3()
	{
		try {
			shopLink.click();
			BaseClass.log().info("Clicked on shopLink");
			ExtentManager.test.log(Status.PASS, "Clicked on shopLink");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on shopLink");
			return false;
		}
	}
	
	public boolean clickOnShopLink4()
	{
		try {
			searchlink.click();
			BaseClass.log().info("Clicked on searchicon");
			ExtentManager.test.log(Status.PASS, "Clicked on searchicon");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on searchicon");
			return false;
		}
	}
	
	public boolean clickOnShopLink5()
	{
		try {
			enterinput.click();
			Actions act1 = new Actions(driver);
            act1.sendKeys("tshirt");
  	        act1.keyDown(Keys.ENTER).build().perform();
			BaseClass.log().info("Clicked on enterinput");
			ExtentManager.test.log(Status.PASS, "Clicked on enterinput");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on enterinput");
			return false;
		}
	}
	
	public boolean clickOnShopLink6()
	{
		try {
			selectproduct.click();
			BaseClass.log().info("Clicked on selectproduct");
			ExtentManager.test.log(Status.PASS, "Clicked on selectproduct");
			return true;
			
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on selectproduct");
			return false;
		}
	}
	
	public boolean clickOnShopLink7()
	{
		try {
			addtocart.click();
			BaseClass.log().info("Clicked on Addtocart");
			ExtentManager.test.log(Status.PASS, "Clicked on Addtocart");
			Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Addtocart");
			return false;
		}
	}

	public boolean clickOnShopLink8()
	{
		try {
			Thread.sleep(1000);
			checkout.click();
			BaseClass.log().info("Clicked on Checkout Button");
			ExtentManager.test.log(Status.PASS, "Clicked on Checkout Button");
			Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Checkout Button");
			return false;
		}
	}
	
	public boolean clickOnShopLink9()
	{
		try {
			inputemail.click();
			Thread.sleep(1000);
			Actions act2 = new Actions(driver);
            act2.sendKeys("adnanmohammad8900@gmail.com");
  	        act2.keyDown(Keys.ENTER).build().perform();
			BaseClass.log().info("Clicked on Input Email");
			ExtentManager.test.log(Status.PASS, "Clicked on Input Email");
			Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Input Email");
			return false;
		}
	}
}
