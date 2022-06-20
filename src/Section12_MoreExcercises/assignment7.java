package Section12_MoreExcercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		// // Maximize window

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		//
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// print number of rows
		List<WebElement> rows = driver.findElements(By.cssSelector("div.left-align table tr"));
		
		for(int i = 0 ; i < rows.size(); i++){
			List<WebElement> th = rows.get(i).findElements(By.tagName("th"));
			for(int j = 0; j < th.size(); j++) {
				System.out.println(th.get(j).getText());
			}
			
			List<WebElement> td = rows.get(i).findElements(By.tagName("td"));
			for(int k = 0; k < td.size(); k++) {
				System.out.println(td.get(k).getText());
			}
			
		}
		
		// print number of columns
		
	}

}
