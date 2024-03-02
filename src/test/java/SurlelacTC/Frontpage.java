package SurlelacTC;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SurlelacpageObjects.FrontPage;
import utilities.BaseClass;

public class Frontpage extends BaseClass{
    
	@Test(description="Frontpage- Abc1 method")
	public void Abc1()
	{
		FrontPage fp1 = new FrontPage();
		SoftAssert softAssert1 = new SoftAssert();
		boolean result = fp1.shop();
		softAssert1.assertEquals(result, true ,"Failed to clicked on shoplink.");
	}
	
	@Test(description="Frontpage- Abc2 method")
	public void Abc2() throws InterruptedException
	{
		Thread.sleep(1000);
		FrontPage fp2 = new FrontPage();
		SoftAssert softAssert2 = new SoftAssert();
		boolean result = fp2.lookbook();
		softAssert2.assertEquals(result, true ,"Failed to clicked on Lookbooklink.");
	}
	
	@Test(description="Frontpage- Abc3 method")
	public void Abc3()
	{
		FrontPage fp3 = new FrontPage();
		SoftAssert softAssert3 = new SoftAssert();
		boolean result = fp3.event();
		softAssert3.assertEquals(result, true ,"Failed to clicked on eventlink.");
	}
	
	@Test(description="Frontpage- Abc4 method")
	public void Abc4()
	{
		FrontPage fp4 = new FrontPage();
		SoftAssert softAssert4 = new SoftAssert();
		boolean result = fp4.contact();
		softAssert4.assertEquals(result, true ,"Failed to clicked on contactlink.");
	}
	
	@Test(description="Frontpage- Abc5 method")
	public void Abc5()
	{
		FrontPage fp5 = new FrontPage();
		SoftAssert softAssert5 = new SoftAssert();
		boolean result = fp5.about();
		softAssert5.assertEquals(result, true ,"Failed to clicked on aboutlink.");
	}
	
	
	@Test(description="Frontpage- Abc6 method")
	public void Abc6()
	{
		FrontPage fp6 = new FrontPage();
		SoftAssert softAssert6 = new SoftAssert();
		boolean result = fp6.policy();
		softAssert6.assertEquals(result, true ,"Failed to clicked on policylink.");
	}
	
	@Test(description="Frontpage- Abc7 method")
	public void Abc7()
	{
		FrontPage fp7 = new FrontPage();
		SoftAssert softAssert7 = new SoftAssert();
		boolean result = fp7.search();
		softAssert7.assertEquals(result, true ,"Failed to clicked on searchlink.");
	}
	
	@Test(description="Frontpage- Abc8 method")
	public void Abc8()
	{
		FrontPage fp8 = new FrontPage();
		SoftAssert softAssert8 = new SoftAssert();
		boolean result = fp8.cart();
		softAssert8.assertEquals(result, true ,"Failed to clicked on cartlink.");
	}
}
