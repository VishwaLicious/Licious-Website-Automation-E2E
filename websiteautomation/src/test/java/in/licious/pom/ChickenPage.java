package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChickenPage extends BasePage {
	
	@FindBy (xpath="//button[@data-text='Chicken Breast (Boneless)']")
	private WebElement chicken_Breast_Boneless;
	
	public ChickenPage(WebDriver driver){
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getChickenBreastBoneless(){
		return chicken_Breast_Boneless;
	}
	
}
