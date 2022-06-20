package Section10_actions_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		// // Maximize window

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//
		driver.get("https://www.amazon.com/");
		
		// Sign in link
		WebElement signIn = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		// Mouse hover on web element by using Actions class in Selenium
		Actions a = new Actions(driver);
		
		// Enter into search box
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
			.click()
			.keyDown(Keys.SHIFT)
			.sendKeys("hello")
			.doubleClick()
			.perform();
		
		a.moveToElement(signIn).build().perform();
		
		
		// Click on Account link
		driver.findElement(By.xpath(" //*[text()='Account']")).click();
		
	}

}
