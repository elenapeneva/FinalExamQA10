package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Browser;

public class HomePageFooter {
	private static String URL = "http://shop.pragmatic.bg/";

	static By contactUs_Location = By.xpath("//div[@class='col-sm-3']//a[@href='http://shop.pragmatic.bg/index.php?route=information/contact']");
	static By returns_Location = By.xpath("//a[contains(@href,'http://shop.pragmatic.bg/index.php?route=account/return/add')]");
	static By siteMap_Location = By.xpath("//a[contains(@href,'http://shop.pragmatic.bg/index.php?route=information/sitemap')]");

	private static WebElement contactUs;
	private static WebElement returns;
	private static WebElement siteMap;

	public static void goToPage() {
		Browser.driver.get(URL);
	}

	public static boolean customerServiceIsDisplayed() {
		contactUs = Browser.driver.findElement(contactUs_Location);
		contactUs.isDisplayed();
		System.out.println("Contact Us is displayed");
		returns = Browser.driver.findElement(returns_Location);
		returns.isDisplayed();
		System.out.println("Returns is displayed");
		siteMap = Browser.driver.findElement(siteMap_Location);
		siteMap.isDisplayed();
		System.out.println("Site Map is displayed");
		return true;
	}

	public static void clickContactUs() {
		contactUs = Browser.driver.findElement(contactUs_Location);
		contactUs.click();

	}
}
