import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class DynamicWebTableData {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\driver\\chromedriver.exe");
		
     driver = new ChromeDriver();
     driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
     
     WebElement table=driver.findElement(By.xpath("//table[@class = 'dataTable']/tbody"));
     
     java.util.List<WebElement> noofrows = table.findElements(By.tagName("tr"));
     int rowscount = noofrows.size();
     
      
     for(int rnum=0;rnum<rowscount;rnum++)
     {
     java.util.List<WebElement> columns=noofrows.get(rnum).findElements(By.tagName("td"));
     System.out.println("Number of columns:"+columns.size());
      
     for(int cnum=0;cnum<columns.size();cnum++)
     {
     System.out.println(columns.get(cnum).getText());
     }
     }
     
     
     
     
     
     
     
     
    java.util.List<WebElement> cloumns = driver.findElements(By.xpath("//table//thead/tr/th"));
     
   //  List<WebElement>  columns =  (List<WebElement>) driver.findElements(By.xpath("//table//thead/tr/th"));
     int columnCount = cloumns.size();
     System.out.println(columnCount);
     System.out.println("No of columns in a table : " + columnCount);
     
     java.util.List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr//td"));
     
   //  List<WebElement>  rows =  (List<WebElement>) driver.findElements(By.xpath("//table//tbody//tr/td[1]"));
     int rowCount = rows.size();
     System.out.println("No of rows in a table : " + rowCount);
     driver.close();
	}

	
	
}
