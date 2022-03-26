package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement Customer;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement AddCustomer;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement CustomerList;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement dashboardPage;

	public void varify_Dashboard() {

		Assert.assertEquals(dashboardPage.getText(), "Dashboard", "This is Wrong Page!!!");

	}

	public void clickCustomerButton() {
		Customer.click();

	}

	public void clickAddCustomer() {
		AddCustomer.click();
	}

	public void customerList() throws InterruptedException {
		Thread.sleep(3000);
		CustomerList.click();
	}



	}


