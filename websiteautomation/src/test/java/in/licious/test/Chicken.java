package in.licious.test;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import in.licious.pom.ChickenPage;
import in.licious.pom.HomePage;
import in.licious.pom.SignInPage;
import in.licious.util.Helper;

public class Chicken extends BaseTest {

	@Test
	public void testChicken(){
		SignInPage signInpage=new SignInPage(driver);
		Helper  helper=new Helper();
		helper.clickOnElement(driver, signInpage.getSelectLocation());
		
		//Helper.customWait(2);
		
		helper.clickOnElement(driver, signInpage.getbengaluruDeliveryLocation());
		helper.enterText(driver, signInpage.getLoactionTxtBox(), "marathalli");
		 Helper.customWait(2);
		signInpage.getLoactionTxtBox().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		Helper.customWait(2);
		
		System.out.println("Pass1");
	
		Helper.customWait(2);
		
		etest.log(LogStatus.PASS,"Location is selected");
		System.out.println("Pass2");
		
		SignInPage signin=new SignInPage(driver);
		 Helper.customWait(4);
		
		System.out.println("Pass3");
		
		
		signin.getLoginBtn().click();
		System.out.println("Pass13");
		
		signin.getUsernameTxtBox().sendKeys("9880335493");
		System.out.println("Pass4");
		
		signin.getPasswordTxtBox().sendKeys("123456");
		signin.getLoginBtn().click();
		
		HomePage home=new HomePage(driver);
		home.getChickenCat().click();
	
		
		
		ChickenPage cp=new ChickenPage(driver);
		cp.getChickenBreastBoneless().click();
		cp.getCart().click();
		
		
		
		
	
	}
}
