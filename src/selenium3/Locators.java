package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		
		// implicit wait: 5 seconds
		// Apply globally to each and every steps
		// if something not showing up , it will wait 5 seconds before throwing error can not find element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(("hello123"));
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		// forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// enter name
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("rahul");
	}

}
