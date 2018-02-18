package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver driver;

	public static void start() {
		System.out.println("Starting browser...");
		System.setProperty("webdriver.chrome.driver", "C:/selenuim_drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void stop() {
		System.out.println("Closing browser...");
		driver.close();
		
	}
}
