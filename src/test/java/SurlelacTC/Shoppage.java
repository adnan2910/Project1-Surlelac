package SurlelacTC;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Ignore;

import SurlelacpageObjects.ShopPage;
import utilities.BaseClass;

public class Shoppage extends BaseClass{
   static boolean result;
   
   @Test(description="Shoppage- xyz1 method", priority=1)
   public void xyz1()
   {
	   ShopPage hm1 = new ShopPage(); 
	   boolean result = hm1.clickOnShopLink1();
	   SoftAssert softassert1 = new SoftAssert();
	   softassert1.assertEquals(result, true,"Failed to click on Shop link.");	
   }
   
   @Test(description="Shoppage - xyz2 method", priority=2)
   public void xyz2()
   {
	   ShopPage hm2 = new ShopPage(); 
	   boolean result = hm2.clickOnShopLink2();
	   SoftAssert softassert2 = new SoftAssert();
	   softassert2.assertEquals(result, true,"Failed to click on Humbergermenu.");	
   }
   
   @Test(description="Shoppage - xyz3 method", priority=3)
   public void xyz3()
   {
	   ShopPage hm3 = new ShopPage(); 
	   boolean result = hm3.clickOnShopLink3();
	   SoftAssert softassert3 = new SoftAssert();
	   softassert3.assertEquals(result, true,"Failed to click on shop link.");	
   }
   
   @Test(description="Shoppage - xyz4 method", priority=4)
   public void xyz4()
   {
	   ShopPage hm4 = new ShopPage(); 
	   boolean result = hm4.clickOnShopLink4();
	   SoftAssert softassert4 = new SoftAssert();
	   softassert4.assertEquals(result, true,"Failed to click on Searchicon.");	
   }
   
   @Test(description="Shoppage - xyz5 method", priority=5)
   public void xyz5()
   {
	   ShopPage hm5 = new ShopPage(); 
	   boolean result = hm5.clickOnShopLink5();
	   SoftAssert softassert5 = new SoftAssert();
	   softassert5.assertEquals(result, true,"Failed to click on Enter Data.");	
   }
   
   @Test(description="Shoppage - xyz6 method", priority=6)
   public void xyz6()
   {
	   ShopPage hm6 = new ShopPage(); 
	   boolean result = hm6.clickOnShopLink6();
	   SoftAssert softassert6 = new SoftAssert();
	   softassert6.assertEquals(result, true,"Failed to click on Select product.");	
   }
   
   @Test(description="Shoppage - xyz7 method", priority=7)
   public void xyz7()
   {
	   ShopPage hm7 = new ShopPage(); 
	   boolean result = hm7.clickOnShopLink7();
	   SoftAssert softassert7 = new SoftAssert();
	   softassert7.assertEquals(result, true,"Failed to click on Addtocart Button.");	
   }

   @Ignore
   @Test(description="Shoppage - xyz8 method", priority=8)
   public void xyz8()
   {
	   ShopPage hm7 = new ShopPage(); 
	   boolean result = hm7.clickOnShopLink8();
	   SoftAssert softassert7 = new SoftAssert();
	   softassert7.assertEquals(result, true,"Failed to click on Checkout Button.");	
   }
   
   @Ignore
   @Test(description="Shoppage - xyz9 method", priority=9)
   public void xyz9()
   {
	   ShopPage hm7 = new ShopPage(); 
	   boolean result = hm7.clickOnShopLink9();
	   SoftAssert softassert7 = new SoftAssert();
	   softassert7.assertEquals(result, true,"Failed to click on Input Email.");	
   }
}
