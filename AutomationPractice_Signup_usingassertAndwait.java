package assignment_11_6th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice_Signup_usingassertAndwait {
	
	public static 
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	WebDriverWait wait;
	
	@BeforeTest
	public void BrowserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test (priority = 1)
	public void launchinghomepage() {
		String url = "https://automationpractice.pl/index.php";
		String title = "My Store";
		String expectedurl = "http://automationpractice.pl/index.php";
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
			
		}
		
	
	
	@Test (priority = 2)
	public void clicksignin () {
		WebElement clicksignin = driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));
		softassert.assertTrue(clicksignin.isEnabled());
		clicksignin.click();
		softassert.assertAll();
		
	}
	@Test (priority = 3)
	public void signup () {
		String email = "selenium11@gmail.com";
		WebElement signupbox = driver.findElement(By.id("email_create"));
		softassert.assertTrue(signupbox.isEnabled());
		signupbox.sendKeys(email);
		//wait.until(ExpectedConditions.visibilityOf(signupbox));
		WebElement createaccount = driver.findElement(By.cssSelector("button[id='SubmitCreate'] span"));
		softassert.assertTrue(createaccount.isEnabled());
		createaccount.click();
		softassert.assertAll();
		
		
	}
	@Test (priority = 4)
	public void signupform() {
		String firstname = "selenium";
		String lastname = "selinum";
		String password = "Selinium@123";
		
		WebElement gender = driver.findElement(By.cssSelector("#id_gender1"));
		softassert.assertTrue(gender.isEnabled());
		gender.click();
		
		WebElement firstnameEl = driver.findElement(By.cssSelector("#customer_firstname"));
		softassert.assertTrue(firstnameEl.isEnabled());
		firstnameEl.sendKeys(firstname);
		
		WebElement lastnameEl = driver.findElement(By.cssSelector("#customer_lastname"));
		softassert.assertTrue(lastnameEl.isEnabled());
		lastnameEl.sendKeys(lastname);
		
		WebElement passwordEl = driver.findElement(By.cssSelector("#passwd"));
		softassert.assertTrue(passwordEl.isEnabled());
		passwordEl.sendKeys(password);
		
		WebElement dropdownDayEl = driver.findElement(By.cssSelector("#days"));
		softassert.assertTrue(dropdownDayEl.isEnabled());
		Select dropdownDay = new Select(dropdownDayEl);
		dropdownDay.selectByValue("10");
		
		WebElement dropdownMonthEl = driver.findElement(By.cssSelector("#months"));
		softassert.assertTrue(dropdownMonthEl.isEnabled());
		Select dropdownMonth = new Select(dropdownMonthEl);
		dropdownMonth.selectByIndex(5);
		
		WebElement dropdownYearEl = driver.findElement(By.cssSelector("#years"));
		softassert.assertTrue(dropdownYearEl.isEnabled());
		Select dropdownYear = new Select(dropdownYearEl);
		dropdownYear.selectByIndex(12);
		
		WebElement NewsletterEl = driver.findElement(By.cssSelector("#newsletter"));
		softassert.assertTrue(NewsletterEl.isEnabled());
		NewsletterEl.click();
		
		WebElement createaccountEl = driver.findElement(By.cssSelector("button[id='submitAccount'] span"));
		softassert.assertTrue(createaccountEl.isDisplayed());
		//createaccountEl.click();
		softassert.assertAll();
		
		
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
	
	

}
