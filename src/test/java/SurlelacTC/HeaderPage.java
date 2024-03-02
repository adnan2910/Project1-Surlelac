package SurlelacTC;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SurlelacpageObjects.Headerpage;
import utilities.BaseClass;

public class HeaderPage extends BaseClass {
   
	@Test(description="HeaderPage- Wxy method", priority=0)
	public void Wxy()
	{
		Headerpage Hp = new Headerpage();
		boolean result = Hp.Shoplink();
		SoftAssert softass = new SoftAssert();
		softass.assertEquals(result, true,"Click to Failed on Shop link.");
	}
	
	@Test(description="HeaderPage- Wxy1 method", priority=1)
	public void Wxy1()
	{
		Headerpage Hp1 = new Headerpage();
		boolean result = Hp1.imgLogo();
		SoftAssert softass1 = new SoftAssert();
		softass1.assertEquals(result, true,"Click to Failed on imageLogo link.");
	}
	
	@Test(description="HeaderPage- Wxy2 method", priority=2)
	public void Wxy2()
	{
		Headerpage Hp2 = new Headerpage();
		boolean result = Hp2.humBerger();
		SoftAssert softass2 = new SoftAssert();
		softass2.assertEquals(result, true,"Click to Failed on Humberger link.");
	}
	
	@Test(description="HeaderPage-  Wxy3", priority=3)
	public void Wxy3()
	{
		Headerpage Hp3 = new Headerpage();
		SoftAssert softAssert3 = new SoftAssert();
		boolean result = Hp3.shop();
		softAssert3.assertEquals(result, true ,"Failed to clicked on shoplink.");
	}
	
	@Test(description="HeaderPage- Wxy4 method", priority=4)
	public void Wxy4() 
	{
		Headerpage Hp4 = new Headerpage();
		SoftAssert softAssert4 = new SoftAssert();
		Hp4.humBerger();
		boolean result = Hp4.lookbook();
		softAssert4.assertEquals(result, true ,"Failed to clicked on Lookbooklink.");
	}
	
	@Test(description="HeaderPage- Wxy5 method", priority=5)
	public void Wxy5()
	{
		Headerpage Hp5 = new Headerpage();
		SoftAssert softAssert5 = new SoftAssert();
		boolean result = Hp5.event();
		softAssert5.assertEquals(result, true ,"Failed to clicked on eventlink.");
	}
	
	@Test(description="HeaderPage- Wxy6 method", priority=6)
	public void Wxy6()
	{
		Headerpage Hp6 = new Headerpage();
		SoftAssert softAssert6 = new SoftAssert();
		boolean result = Hp6.contact();
		softAssert6.assertEquals(result, true ,"Failed to clicked on contactlink.");
	}
	
	@Test(description="HeaderPage- Wxy7 method", priority=7)
	public void Wxy7()
	{
		Headerpage Hp7 = new Headerpage();
		SoftAssert softAssert7 = new SoftAssert();
		boolean result = Hp7.about();
		softAssert7.assertEquals(result, true ,"Failed to clicked on aboutlink.");
	}
	
	
	@Test(description="HeaderPage- Wxy8 method", priority=8)
	public void Wxy8()
	{
		Headerpage Hp8 = new Headerpage();
		SoftAssert softAssert8 = new SoftAssert();
		boolean result = Hp8.policy();
		softAssert8.assertEquals(result, true ,"Failed to clicked on policylink.");
	}
	
	@Test(description="HeaderPage- Wxy9 method", priority=9)
	public void Wxy9()
	{
		Headerpage Hp9 = new Headerpage();
		SoftAssert softAssert9 = new SoftAssert();
		boolean result = Hp9.search();
		softAssert9.assertEquals(result, true ,"Failed to clicked on searchlink.");
	}
	
	@Test(description="HeaderPage- Wxy10 method", priority=10)
	public void Wxy10()
	{
		Headerpage Hp10 = new Headerpage();
		SoftAssert softAssert10 = new SoftAssert();
		boolean result = Hp10.cart();
		softAssert10.assertEquals(result, true ,"Failed to clicked on cartlink.");
	}
  
	@Test(description="HeaderPage- Wxy11 method", priority=11)
	public void Wxy11()
	{
		Headerpage Hp11 = new Headerpage();
		boolean result = Hp11.crossicon();
		SoftAssert softass11 = new SoftAssert();
		softass11.assertEquals(result, true,"Click to Failed on cross icon.");
	}
	
	@Test(description="HeaderPage- Wxy12 method", priority=12)
	public void Wxy12()
	{
		Headerpage Hp12 = new Headerpage();
		boolean result = Hp12.Search();
		SoftAssert softass12 = new SoftAssert();
		softass12.assertEquals(result, true,"Click to Failed on search icon.");
	}
	
	@Test(description="HeaderPage- Wxy13 method", priority=13)
	public void Wxy13()
	{
		Headerpage Hp13 = new Headerpage();
		boolean result = Hp13.xsearch();
		SoftAssert softass13 = new SoftAssert();
		softass13.assertEquals(result, true,"Click to Failed on xsearch icon.");
	}
	
	@Test(description="HeaderPage- Wxy14 method", priority=14)
	public void Wxy14()
	{
		Headerpage Hp14 = new Headerpage();
		boolean result = Hp14.carticon();
		SoftAssert softass14 = new SoftAssert();
		softass14.assertEquals(result, true,"Click to Failed on cart icon.");
	}

	
}