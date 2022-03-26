package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	
	ExcelReader exclRead = new ExcelReader("C:\\Users\\amin2\\eclipse-workspace\\SeleniumClass\\Exl_Project\\Test_data\\exl_Data.xlsx");
	String userNAME = exclRead.getCellData("Logininfo", "UserName", 2);
	String userPASSWORD = exclRead.getCellData("Logininfo", "Password", 2);

	@Test
	public void testLogin() {

		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insert_UserName(userNAME);
		login.insert_password(userPASSWORD);
		login.clickSignIn();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varify_Dashboard();
		BrowserFactory.tearDown();

	}

}
