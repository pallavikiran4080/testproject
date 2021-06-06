import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {
	
public static WebDriver driver;
	
	@BeforeTest
	public void open() {
	
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\driver\\chromedriver.exe");
	
    driver = new ChromeDriver();
    driver.get("https://www.angelfire.com/super/badwebs/");
    
	}
    
	@Test
	public void data() {
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println(frames.size());
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
	}


}
