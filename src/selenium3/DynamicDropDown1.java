package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		
		// Click Passengers Drop Down
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		// Click + in Adult
		// while loop
//		int i = 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();	
//			i++;
//			
//			// click 4 times
//		}
		
		
		// Click + in Adult 
		// for loop
		for(int j = 1; j< 5; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		
		// Click Done
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// Get number of passengers
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
