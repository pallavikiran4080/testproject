import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableData {
	
public static WebDriver driver;
	
	@BeforeTest
	public void open() {
	
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\driver\\chromedriver.exe");
	
    driver = new ChromeDriver();
    driver.get("https://www.timeanddate.com/worldclock/");
    
	}
    
	@Test
	public void data() {
		
		java.util.List<WebElement> rows = driver.findElements(By.tagName("tr"));
		java.util.List<WebElement> columns = driver.findElements(By.tagName("td"));
		
		for(int i=1;i<rows.size();i++) {
			for(int j=1;j<columns.size();j++) {
				
				String s= driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(s);
			}
			System.out.println();
		}
	}


}
