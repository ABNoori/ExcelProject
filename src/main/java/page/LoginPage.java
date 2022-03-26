package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Web Elements

	@FindBy(how = How .XPATH, using = "//*[@id=\"username\"]") WebElement UserName_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement password_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement loginbutton;
	
	
	//Methods
	
	public void insert_UserName(String userName) {
		UserName_Element.sendKeys(userName);
	}
	
	public void insert_password(String password) {
		password_Element.sendKeys(password);
	}
	
	public void clickSignIn() {
		loginbutton.click();
		
	}

}
