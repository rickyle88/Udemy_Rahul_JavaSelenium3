package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ElementVisible {

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
		
		// Check if Return Date is not enabled
		
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		// Click Round Trip radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		// Check if Return Date is enabled
		
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}else {
			System.out.println("it's not enabled");
			Assert.assertTrue(false);
		}
		
		
	}

}
