package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 
		
		

		WebDriver driver = new ChromeDriver();
//		
//		// Maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		
		// Select From
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();        
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
        
        
        // Select To
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        
        // Depart Date -> Select Current Date
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

	}

}
