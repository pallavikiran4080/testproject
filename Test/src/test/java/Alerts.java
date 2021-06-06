import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {

	
public static WebDriver driver;
	
	@BeforeTest
	public void open() {
	
	//kiran
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\driver\\chromedriver.exe");
	
    driver = new ChromeDriver();
    driver.get("https://www.tsrtconline.in/oprs-web/");
    
	}
	
	@Test
	public void data() throws InterruptedException {
		
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(300);
		driver.switchTo().alert();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
