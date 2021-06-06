import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng { 
	
	public static WebDriver driver;
	
	@BeforeTest
	public void open() {
	
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\driver\\chromedriver.exe");
	
    driver = new ChromeDriver();
    
    driver.get("https://opensource-demo.orangehrmlive.com/");
    
	}
	
	@Test
	public void login() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void status() throws InterruptedException {
		
		String actual = driver.findElement(By.linkText("welcome paul")).getText();
		
		String expected = "welcome admin";
		
		Assert.assertEquals(actual, expected);
		
		Thread.sleep(5000);
		
	}
	
	@Test
	public void logout() {
		
		driver.findElement(By.linkText("welcome paul")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
	}
	
	
	
		
		
		
				
	}

