package testShoppingPragmatic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObjects.ContactUsForm;
import pageObjects.HomePageFooter;
import utilities.Browser;

public class TestHomePageFooter {

	@Test
	public void customerService() {
		HomePageFooter.goToPage();
		Assert.assertTrue(HomePageFooter.customerServiceIsDisplayed());
		HomePageFooter.clickContactUs();
		Assert.assertEquals("Contact Us", Browser.driver.getTitle());

	}

	@Test
	public void submitContactForm() {
		ContactUsForm.goToPragmaticBG();
		Assert.assertEquals("Contact Us", Browser.driver.getTitle());
		ContactUsForm.setName("Elena Peneva");
		;
		ContactUsForm.setEmail("elena_peneva@yahoo.com");
		ContactUsForm.writeEnquiry("This is test!");
		ContactUsForm.submitForm();
		Assert.assertTrue(ContactUsForm.submitionResult());

	}

	@Before
	public void setUp() {
		Browser.start();
	}

	@After
	public void close() {
		Browser.stop();
	}
}
