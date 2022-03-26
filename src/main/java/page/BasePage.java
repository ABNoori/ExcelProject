package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitforElement(WebDriver driver, int waitTime, WebElement element) {
		//WebDriverWait wait = new WebDriverWait(driver, waitTime);
		//wait.until(ExpectedConditions.visibilityOf(element));

	}
}
