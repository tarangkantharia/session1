package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negloginTest();
		tearDown();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taran\\Selenium\\crm\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
////		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
////		Clear cashe
//		driver.manage().deleteAllCookies();
//		
////		go to website
//		driver.get("https://techfios.com/billing/?ng=dashboard/");
//		
////		Maximize
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.id("password")).sendKeys("abc123");
//		driver.findElement(By.name("login")).click();
		
		}
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
//		Clear cashe
		driver.manage().deleteAllCookies();
		
//		go to website
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		
//		Maximize
		driver.manage().window().maximize();
		
		
	}
	
	public static void tearDown() {

		driver.close();
		driver.quit();
		
	}
	
	public static void loginTest() {
		

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	
	public static void negloginTest() {


		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();		
	}
	
}
