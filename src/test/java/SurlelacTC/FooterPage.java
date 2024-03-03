package SurlelacTC;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SurlelacpageObjects.Footerpage;
import utilities.BaseClass;

public class FooterPage extends BaseClass{
    
	@Test(description="FooterPage- Wxy method", priority=0)
	public void Wxy()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.Shoplink();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on Shop link.");
	}
	
	@Test(description="FooterPage- Wxy1 method", priority=1)
	public void Wxy1()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.scrollpage();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on Scroll page.");
	}
	
	
	@Test(description="FooterPage- Wxy2 method", priority=2)
	public void Wxy2()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.emailinpt();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on email input box.");
	}
	
	@Ignore
	@Test(description="FooterPage- Wxy3 method", priority=3)
	public void Wxy3()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.subscibebtn();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on Subscribe button.");
	}
	
	@Test(description="FooterPage- Wxy4 method", priority=4)
	public void Wxy4()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.priPolicy();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on privacy policy.");
	}
	
	@Test(description="FooterPage- Wxy5 method", priority=5)
	public void Wxy5()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.instaBtn();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on Instagram.");
	}
	
	@Test(description="FooterPage- Wxy5 method", priority=6)
	public void Wxy6()
	{
		Footerpage Hp = new Footerpage();
		boolean result = Hp.pwdlink();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on pwdlink.");
	}
}
