package selenium3;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		String name = "Nguyen";

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		
//		// Maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Enter name
		driver.findElement(By.id("name")).sendKeys(name);

		// click alert button
		driver.findElement(By.id("alertbtn")).click();

		// Alert
		Alert simpleAlert = driver.switchTo().alert();

		// switch to alert and get text
		System.out.println(simpleAlert.getText());

//		Thread.sleep(2000);

		// Alert: click OK
		simpleAlert.accept();

//		Thread.sleep(2000);

		// Click Confirm button
		driver.findElement(By.id("confirmbtn")).click();

		// switch to alert and get text
		System.out.println(simpleAlert.getText());

		// Click Cancel on alert
		simpleAlert.dismiss();

	}
	
	public static void getScreenShot(WebDriver driver) {
		driver.get("https://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}

}
