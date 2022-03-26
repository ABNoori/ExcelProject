package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver driver;
	ExcelReader exclRead = new ExcelReader("Test_data\\exl_Data.xlsx");
	String userNAME = exclRead.getCellData("Logininfo", "UserName", 2);
	String userPASSWORD = exclRead.getCellData("Logininfo", "Password", 2);
	String fullName = exclRead.getCellData("AddContactinfo", "FullName", 2);
	String companyName = exclRead.getCellData("AddContactinfo", "CompanyName", 2);
	String email = exclRead.getCellData("AddContactinfo", "Email", 2);
	String phone = exclRead.getCellData("AddContactinfo", "Phone", 2);
	String address = exclRead.getCellData("AddContactinfo", "Address", 2);
	String city = exclRead.getCellData("AddContactinfo", "City", 2);
	String country = exclRead.getCellData("AddContactinfo", "Country", 2);
	String state = exclRead.getCellData("AddContactinfo", "State", 2);
	String zip = exclRead.getCellData("AddContactinfo", "Zip", 2);

	@Test
	public void userSouldAddCustomer() throws InterruptedException {
		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insert_UserName(userNAME);
		loginPage.insert_password(userPASSWORD);
		loginPage.clickSignIn();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varify_Dashboard();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomer();

		AddCustomerPage addcostumerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcostumerPage.verifyAddContactPage();
		addcostumerPage.insertFullNmae(fullName);
		addcostumerPage.insertCompany(companyName);
		addcostumerPage.insertEmail(email);
		addcostumerPage.insertPhone(phone);
		addcostumerPage.insertAdress(address);
		addcostumerPage.insertCity(city);
		addcostumerPage.insertState(state);
		addcostumerPage.insertZip(zip);
		addcostumerPage.insertCountry(country);
		addcostumerPage.clickSubmit();
		Thread.sleep(3000);
		dashboardPage.customerList();
		Thread.sleep(2000);
		addcostumerPage.verifyNAME();

	}

}
