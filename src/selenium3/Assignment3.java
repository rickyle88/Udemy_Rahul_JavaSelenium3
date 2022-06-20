package selenium3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		// // Maximize window

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		// Login: (username is rahulshettyacademy and Password is learning)
		// Enter username
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		// Enter password
		driver.findElement(By.id("password")).sendKeys("learning");
		
		// Select user
		driver.findElement(By.cssSelector("div.form-check-inline label:nth-child(2) span:nth-child(3)")).click();
		
		// Click OK button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal button:nth-child(2)")));
		driver.findElement(By.cssSelector("div.modal button:nth-child(2)")).click();
		
		// Select Consultant
		// static dropdown
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		
		Select ddd = new Select(dropdown);
		
		ddd.selectByValue("consult");
		
	
		
		// Check I agree checkbox 
		driver.findElement(By.id("terms")).click();
		
		// click Submit
		driver.findElement(By.id("signInBtn")).click();
		
		// Wait
		
		// Click Add button 
		List<WebElement> li = driver.findElements(By.cssSelector("div.card button")); 
		
		for(int i = 0; i < li.size(); i++) {
			li.get(i).click();
		}
		
		// Click Cart button
		driver.findElement(By.xpath("//a[contains(text(), 'Checkout')]")).click();
	}

}
