package Section11_RealTimeExercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar1 {

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
		driver.get("https://www.path2usa.com/travel-companions");
		
		// Click on From
		driver.findElement(By.id("travel_date")).click();
		
		
				
		
		// Month
//		String strMonthSelectred = driver.findElement(By.cssSelector("div.datepicker-days th.datepicker-switch")).getText();
//		boolean monthSelected = strMonthSelectred.contains("August");
		
		WebElement nextMonth = driver.findElement(By.cssSelector("div.datepicker-days th.next"));
		WebElement prevMonth = driver.findElement(By.cssSelector("div.datepicker-days th.prev"));
		
		// We need to add logic in while statement
		while(!driver.findElement(By.cssSelector("div.datepicker-days th.datepicker-switch")).getText().contains("December")) {


			nextMonth.click();
			
//			// Close popup window
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//			WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.sumome-react-wysiwyg-popup-animation-group span div div.sumome-react-wysiwyg-close-button")));
//			popup.click();
		}
		
		// Day
		
		// April 14 => Month Day
		
		
		// Note: All the day has class name "day" , we need to find common attribute to identify web element, put in a loop and iterate
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		for(int i = 0; i < dates.size(); i++) {
			String dayText = dates.get(i).getText();
			if(dayText.equalsIgnoreCase("25")) {
				dates.get(i).click();
				break;
			}
		}
	}

}
