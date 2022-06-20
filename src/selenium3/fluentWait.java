package selenium3;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWait {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		// // Maximize window
		
		// Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		// click start button
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		
		// Fluent Wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//					.withTimeout(Duration.ofSeconds(30))
//					.pollingEvery(Duration.ofSeconds(3))
//					.ignoring(NoSuchElementException.class);
//		
//		// We need to build customized wait method for web element
//		 WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//		       if( driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
//		    	   return driver.findElement(By.cssSelector("div[id='finish'] h4"));
//		       }else
//		    	   return null;
//		     }
//		   });
		 
		 // WebDriverWait
		 WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='finish'] h4")));
		 
		 System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());
		 System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
	}

}
