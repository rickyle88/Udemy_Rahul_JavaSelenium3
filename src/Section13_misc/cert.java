package Section13_misc;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		//
		// // Maximize window

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		//
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
	}

}
