package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement Customer_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement AddCustomer_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FullName_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement Company_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement Email_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PhoneNumber_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement Address_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement City_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement State_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZipCode_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]")
	WebElement Country_Ele;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement Submitbutton_Ele;

	public void verifyAddContactPage() {

		waitforElement(driver, 10, AddCustomer_Ele);

		Assert.assertEquals(AddCustomer_Ele.getText(), "Add Customer", "Wrong Page!!!");

	}

	public void insertFullNmae(String fullname) {

		int randomGen = generateRandomNumber(999);

		FullName_Ele.sendKeys(fullname + randomGen);
	}

	public int generateRandomNumber(int randomNumber) {
		Random random = new Random();
		return random.nextInt(randomNumber);

	}

	public void insertCompany(String companyName) {

		SelectFromDropdown(Company_Ele, companyName);

	}

	private void SelectFromDropdown(WebElement company_Ele, String companyName) {

	}

	public void insertEmail(String email) {
		Email_Ele.sendKeys(generateRandomNumber(999) + email);
	}

	public void insertPhone(String phone) {
		PhoneNumber_Ele.sendKeys(phone + generateRandomNumber(999));

	}

	public void insertAdress(String address) {
		Address_Ele.sendKeys(address);
	}

	public void insertCity(String city) {
		City_Ele.sendKeys(city);
	}

	public void insertState(String state) {
		State_Ele.sendKeys(state);
	}

	public void insertZip(String zipcode) {
		ZipCode_Ele.sendKeys(zipcode);
	}

	public void insertCountry(String country) {
		SelectFromDropdown(Country_Ele, country);

	}

	public void clickSubmit() {
		Submitbutton_Ele.click();
	}

	// tbody//tr[1]//td[3]
	// tbody//tr[2]//td[3]
	// tbody//tr[3]//td[3]
	// tbody//tr[4]//td[3]
	// tbody//tr[5]//td[3]
	String befor = "//tbody//tr[";
	String after = "]//td[3]";

	public void verifyNAME() {
		for (int i = 1; i <= 5; i ++) {
			String xName = driver.findElement(By.xpath(befor + i + after)).getText();
			System.out.println(xName);
			break;

			// Assert.assertEquals(xName, FullName_Ele.sendKeys(fullname + randomGen), "the name is not here");
		}
		

	}

}
