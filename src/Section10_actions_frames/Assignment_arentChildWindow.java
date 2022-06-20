package Section10_actions_frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_arentChildWindow {

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
		driver.get("https://the-internet.herokuapp.com/windows");
		
		// Click on Get Access url on top right corner
		driver.findElement(By.partialLinkText("Click")).click();
		
		// Switch to child window
		Set<String> windows = driver.getWindowHandles();	//[parentId, childId]
		
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		// Get text: Please email us at mentor@rahulshettyacademy.com with below template to receive response
//		System.out.println(driver.findElement(By.cssSelector("div.container p.im-para.red")).getText());
//		driver.findElement(By.cssSelector("div.container p.im-para.red")).getText();
		// Extract email from the text above
		String childText = driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(childText);
		
		// Switch back to parent window
		driver.switchTo().window(parentId);
		
		String parentText = driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(parentText);
		
		

}
}