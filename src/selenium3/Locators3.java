package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Selenium will wait until all the components are fully loaded
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// driver.navigate().to() : no wait, need to handle wait, but we can move forward and backward
		driver.navigate().to("https://msn.com");
		
		driver.navigate().back();
//		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
	}

}
