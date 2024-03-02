package SurlelacpageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;

import utilities.BaseClass;
import utilities.ExtentManager;

public class Headerpage extends BaseClass {
	
	@FindBy(xpath="//a[@href='/collections/all']")
	WebElement Shoplink;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/sticky-header/header/div[1]/div/div[2]/a/img")
	WebElement imgLogo;
	
	@FindBy(xpath="//details[@id='Details-menu-drawer-container']//summary[contains(@class,'header__icon--menu')]")
	WebElement humBerger;
	
	@FindBy(xpath="//header-drawer[@id='window-menu']//*[name()='svg' and @class='icon icon-close']")
	WebElement crossicon;
	
	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/collections/all']")
	WebElement shoplink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/pages/look-book']")
	WebElement lookbooklink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/pages/events']")
	WebElement eventslink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/pages/contact']")
	WebElement contactlink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/pages/about']")
	WebElement aboutlink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/pages/privacy-policy']")
	WebElement policylink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/search']")
	WebElement searchlink;

	@FindBy(xpath="//header-drawer[@id='window-menu']//ul[contains(@class,'menu-drawer__menu')]//a[@href='/cart']")
	WebElement cartlink;
	
	@FindBy(xpath="//div[contains(@class,'site-search-cart')]//div[contains(@class,'uk-nav-wrapper')]//a[contains(@class,'customsearch')]")
	WebElement search;
	
	@FindBy(xpath="//div[contains(@class,'site-search-cart')]//button[contains(@class,'search-close')]")
	WebElement xsearch;
	
	@FindBy(xpath="//div[contains(@class,'site-search-cart')]//a[@id='cart-icon-bubble']")
	WebElement carticon;
	
	public Headerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean Shoplink()
	{
		try {
			Shoplink.click();
			BaseClass.log().info("Clicked on Shop link");
			ExtentManager.test.log(Status.PASS, "Clicked on Shop link");
			Thread.sleep(2000);
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Shop link");
			return false;
		}
	}
	
	public boolean imgLogo()
	{
		try {
			imgLogo.click();
			BaseClass.log().info("Clicked on imageLogo link");
			ExtentManager.test.log(Status.PASS, "Clicked on imageLogo link");
			Thread.sleep(2000);
			driver.navigate().back();
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on imageLogo link");
			return false;
		}
	}
	
	public boolean humBerger()
	{
		try {
			humBerger.click();
			BaseClass.log().info("Clicked on Humberger link");
			ExtentManager.test.log(Status.PASS, "Clicked on Humberger link");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on Humberger link");
			return false;
		}
	}
	
	public boolean shop()
	{
		try {
			shoplink.click();
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
			lookbooklink.click();
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
			Thread.sleep(2000);
			Headerpage hp = new Headerpage();
			hp.humBerger();
			Thread.sleep(2000);
			eventslink.click();
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
			Thread.sleep(2000);
			Headerpage hp1 = new Headerpage();
			hp1.humBerger();
			Thread.sleep(2000);
			contactlink.click();
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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Headerpage hp2 = new Headerpage();
			hp2.humBerger();
			Thread.sleep(2000);
			aboutlink.click();
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
			Thread.sleep(2000);
			Headerpage hp3 = new Headerpage();
			hp3.humBerger();
			Thread.sleep(2000);
			policylink.click();
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
			Thread.sleep(2000);
			Headerpage hp4 = new Headerpage();
			hp4.humBerger();
			Thread.sleep(2000);
			searchlink.click();
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
			Thread.sleep(2000);
			Headerpage hp5 = new Headerpage();
			hp5.humBerger();
			Thread.sleep(2000);
			cartlink.click();
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
	
	public boolean crossicon()
	{
		try {
			Headerpage hp6 = new Headerpage();
			hp6.humBerger();
			crossicon.click();
			BaseClass.log().info("Clicked on cross icon");
			ExtentManager.test.log(Status.PASS, "Clicked on cross icon");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on cross icon");
			return false;
		}
	}
	
	public boolean Search()
	{
		try {
			search.click();
			BaseClass.log().info("Clicked on search icon");
			ExtentManager.test.log(Status.PASS, "Clicked on search icon");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on search icon");
			return false;
		}
	}
	
	public boolean xsearch()
	{
		try {
			xsearch.click();
			BaseClass.log().info("Clicked on xsearch icon");
			ExtentManager.test.log(Status.PASS, "Clicked on xsearch icon");
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on xsearch icon");
			return false;
		}
	}
	
	public boolean carticon()
	{
		try {
			carticon.click();
			BaseClass.log().info("Clicked on cart icon");
			ExtentManager.test.log(Status.PASS, "Clicked on cart icon");
			driver.navigate().back();
			return true;
		}catch(Exception e)
		{
			BaseClass.log().error("Exception generated: " + e);
			ExtentManager.test.log(Status.FAIL, "Failed to click on cart icon");
			return false;
		}
	}
	
}
