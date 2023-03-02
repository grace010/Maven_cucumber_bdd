package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookSteps {
	WebDriver driver;
	@Given("^Open facebook application$")
	public void openFacebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Then("^Verify texbok is displayed$")
	public void verifyTexbokIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());

	}

	@Then("^Verify password is displayed$")
	public void verifyPasswordIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());

	}
	
	@Then("^Close application$")
	public void closeApplication() {
		driver.quit();

	}

}
