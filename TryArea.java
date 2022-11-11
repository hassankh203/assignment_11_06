package assignment_11_6th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryArea {
 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a.mailicon")).click();
		String username = "seleniumpanda@rediffmail.com";
		String password = "Selenium@123";
		
		
		driver.findElement(By.cssSelector("#login1")).sendKeys(username);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[name='proceed']")).click();

	}

}
