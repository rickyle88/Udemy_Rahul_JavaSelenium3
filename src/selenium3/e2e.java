package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

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
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
        
        
        // Select To
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        
        // Depart Date -> Select Current Date
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
        
        // Check if another calendar is enabled
//        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
//        	System.out.println("It is enabled");
//        	Assert.assertTrue(false);
//        }
//        else
//        {
//        	Assert.assertTrue(true);
//        }
        
        // Click on Senior discount
        
        // Set to 5 adult passenger
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i = 1; i <5; i++) {
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        
        // Click on Done button
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        
        // Click Search button
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

}
}
