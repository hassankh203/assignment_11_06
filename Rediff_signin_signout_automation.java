package assignment_11_6th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_signin_signout_automation {
	public static WebDriver driver;
	WebDriverWait wait;
	SoftAssert softassert = new SoftAssert();

	@BeforeTest
	public void WebdriverSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void LaunchingHomePage() {
		String url = "https://rediff.com";
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

	@Test(priority = 2)
	public void FillingSigninForm() throws InterruptedException {
		String username = "seleniumpanda@rediffmail.com";
		String password = "Selenium@123";

		WebElement signinbutton = driver.findElement(By.cssSelector("a[title='Already a user? Sign in']"));
		softassert.assertTrue(signinbutton.isDisplayed());

		signinbutton.click();

		WebElement usernameEl = driver.findElement(By.cssSelector("#login1"));
		softassert.assertTrue(usernameEl.isEnabled());
		usernameEl.sendKeys(username);

		WebElement passwordEl = driver.findElement(By.cssSelector("input#password"));
		softassert.assertTrue(passwordEl.isEnabled());
		passwordEl.sendKeys(password);

		WebElement signinbuttonEl = driver.findElement(By.cssSelector("input[name='proceed']"));
		softassert.assertTrue(signinbuttonEl.isEnabled());
		signinbuttonEl.click();
		softassert.assertAll();
	}

	@Test(priority = 3)
	public void Logout() {

		WebElement logoutbuttonEl = driver.findElement(By.cssSelector("a.rd_logout"));
		softassert.assertTrue(logoutbuttonEl.isEnabled());
		logoutbuttonEl.click();
		softassert.assertAll();

	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}
