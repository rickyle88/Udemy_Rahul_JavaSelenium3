package selenium3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 
		
		

		WebDriver driver = new ChromeDriver();
//		
//		// Maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// checkbox 1
		WebElement chk1 = driver.findElement(By.id("checkBoxOption1"));
		
		// click checkbox 1
		chk1.click();
		
		// Assertion true on checkbox 1
		Assert.assertTrue(chk1.isSelected());
		
		// uncheck checkbox 1
		chk1.click();
		
		// Assertion false on checkbox 1
		Assert.assertFalse(chk1.isSelected());
		
		// Count number of checkboxes
		List<WebElement> chk = driver.findElements(By.cssSelector("input[type='checkbox']")); 
		
		System.out.println("Number of checkboxes " + chk.size());
		
	}

}
