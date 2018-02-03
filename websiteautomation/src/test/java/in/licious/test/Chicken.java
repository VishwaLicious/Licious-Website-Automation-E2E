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
		helper.clickOnElement(driver, signInpage.getbengaluruDeliveryLocation());
		helper.enterText(driver, signInpage.getLoactionTxtBox(), "indranagar,Bengaluru");
		Helper.customWait(2);
		signInpage.getLoactionTxtBox().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Helper.customWait(6);
		etest.log(LogStatus.PASS,"Location is selected");
		SignInPage signin=new SignInPage(driver);
		signin.getUsernameTxtBox().sendKeys("9880335493");
		signin.getPasswordTxtBox().sendKeys("123456");
		signin.getLoginBtn().click();
		
		HomePage home=new HomePage(driver);
		home.getChickenCat().click();
		
		
		
		ChickenPage cp=new ChickenPage(driver);
		cp.getChickenBreastBoneless().click();
		cp.getCart().click();
		
		
		
		
	
	}
}
