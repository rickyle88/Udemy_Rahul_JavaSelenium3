package Section12_MoreExcercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecutorDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		// // Maximize window

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		//
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		
		// Scroll to table 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		


		js.executeScript("document.querySelector(\".tableFixHead\").scrollIntoView()");
//		js.executeScript("window.scrollBy(0,500)");
//		
		//Scroll to last row of table
//		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
		// Calculate sum of Amount column
		
		// Get number of Amount
		int total = 0;
		List<WebElement> listAmount = driver.findElements(By.xpath("//div[@class='tableFixHead']/table[@id='product']/tbody/tr/td[4]"));
		
		// for css selector: .tableFixHead td:nth-child(4)
		for(int i = 0 ; i < listAmount.size(); i++) {
			total += Integer.parseInt(listAmount.get(i).getText().toString());
			
		}
		
		// Compare calculated value with the one that displayed on web site
		driver.findElement(By.cssSelector("div.totalAmount"));
		WebElement displayedTotalAmount = driver.findElement(By.cssSelector("div.totalAmount"));
		int strTotalAmount = Integer.parseInt(displayedTotalAmount.getText().split(":")[1].trim());
		
		Assert.assertEquals(strTotalAmount, total);
		
		
		
		
		
	}

}
