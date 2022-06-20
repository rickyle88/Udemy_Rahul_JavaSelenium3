package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes1 {

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
		
		WebElement isSeniorCheckBox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		
		// Assertion False
		Assert.assertFalse(isSeniorCheckBox.isSelected());
		// check if checkbox is not checked ;;;;
		System.out.println(isSeniorCheckBox.isSelected());
		
		// click on checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		// check if checkbox is checked 
		System.out.println(isSeniorCheckBox.isSelected());
		
		// Assertion True
		Assert.assertTrue(isSeniorCheckBox.isSelected());
		
		// Count how many checkboxes in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		// number of passengers
		String num = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(num, "1 Adult");
		
	}

}
