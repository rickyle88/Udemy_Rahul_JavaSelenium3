package Section10_actions_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame2 {

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
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//Switch to iframe
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		// Switch back to main window
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.tagName("noframes")).getText());
		// Find all iframe
//		int count = driver.findElements(By.tagName("iframe")).size();
//		driver.switchTo().frame(0);
		
	}

}
