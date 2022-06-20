package selenium3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 
		
		

		WebDriver driver = new ChromeDriver();
//		
//		// Maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		
		// country 
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		// British Indian, India, Indonesia
		
		// Get all web elements that contains Ind
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		
		// Iterate all web elements
		for(WebElement option : options) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
			
		}
	}

}
