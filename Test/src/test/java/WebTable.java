import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

public class WebTable {
    
public static WebDriver driver;
	
	@BeforeTest
	public void open() {
	
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\driver\\chromedriver.exe");
	
    driver = new ChromeDriver();
    driver.get("https://www.timeanddate.com/worldclock/");
    
	}
    
	@Test
	public void data() {
		
		java.util.List<WebElement> tables = driver.findElements(By.tagName("table"));
		
		System.out.println(tables.size());
		
		java.util.List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		System.out.println(rows.size());
		
		java.util.List<WebElement> columns = driver.findElements(By.tagName("td"));
		System.out.println(columns.size());
		
	}
 
	
}


