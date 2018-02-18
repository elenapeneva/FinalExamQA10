package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Browser;

public class ContactUsForm {

	static By name_Location = By.id("input-name");
	static By email_Location = By.id("input-email");
	static By enquiry_Location = By.id("input-enquiry");
	static By submitButton_Location = By.xpath("//input[@type='submit'][@value='Submit']");
	static By continueButton_Location = By.xpath("//div[@id='content']//a[@href='http://shop.pragmatic.bg/index.php?route=common/home']");

	
	private static WebElement name;
	private static WebElement email;
	private static WebElement enquiry;
	private static WebElement submitButton;
	private static WebElement continueButton;

	
	public static void goToPragmaticBG() {
		HomePageFooter.goToPage();
		HomePageFooter.clickContactUs();
	}

	public static void setName(String username) {
		name = Browser.driver.findElement(name_Location);
		name.sendKeys(username);
	}

	public static void setEmail(String userEmail) {
		email = Browser.driver.findElement(email_Location);
		email.sendKeys(userEmail);
	}

	public static void writeEnquiry(String userEnquiry) {
		enquiry = Browser.driver.findElement(enquiry_Location);
		enquiry.sendKeys(userEnquiry);
	}

	public static void submitForm() {
		submitButton = Browser.driver.findElement(submitButton_Location);
		submitButton.click();

	}
	public static boolean submitionResult() {
		continueButton = Browser.driver.findElement(continueButton_Location );
		continueButton.isDisplayed();
		return true;
	}
	
}
