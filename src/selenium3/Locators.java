package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		
		// implicit wait: 5 seconds
		// Apply globally to each and every steps
		// if something not showing up , it will wait 5 seconds before throwing error can not find element
		// wait for the object to show on the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(("hello123"));
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		// forgot password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// When app changes from view 1 to view 2, we might run into interception error
		// we have to wait until the new view is fully loaded 
		// we can add a wait 1 second
		Thread.sleep(1000);
		// enter name
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("rahul");
		
		// traverse from parent to child
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7145675544");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		// Go to log in page and CHANGE THE VIEW
		driver.findElement(By.xpath("//div[contains(@class,'forgot-pwd-btn-conainer')]//button[1]")).click();
		
		// we can add a wait 1 second
		Thread.sleep(1000);
		
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(("rahulshettyacademy"));
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
