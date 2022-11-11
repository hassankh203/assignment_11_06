package assignment_11_6th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3_methodsCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3_methodsCreation callingMethods = new Class3_methodsCreation();
		callingMethods.launchReddifWebsite();
		callingMethods.launchAmazonWebsite();
		callingMethods.launchEbayWebsite();
		callingMethods.launchShopifyWebsite();
		callingMethods.launchWalmartWebsite();
		rediff();
		amazon();
		ebay();
		shopify();
		callingMethods.walmart();
		
		
	

	}

	public void launchReddifWebsite() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.quit();

	}
	public void launchAmazonWebsite() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.quit();}
	
	
	public void launchEbayWebsite() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		driver.quit();}
	
	public void launchWalmartWebsite() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://walmart.com");
		driver.quit();}
	
	
	public void launchShopifyWebsite() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shopify.com");
		driver.quit();}
	
	
	public static void rediff() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.quit();

	}
	public static void amazon() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.quit();}
	
	
	public static void ebay() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		driver.quit();}
	
	public static void walmart() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://walmart.com");
		driver.quit();}
	
	
	public static void shopify() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shopify.com");
		driver.quit();}

}
