package selenium3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cart2 {

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
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Array contains list of items
		String[] itemsNeeded = { "Cauliflower", "Cucumber", "Beetroot" };

		// Call method to add items to cart without creating object
		addItems(driver, itemsNeeded);
		
		// Click Cart 
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		// Click PROCEED TO CHECKOUT button (static text)
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		// Enter promo code
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		// Click Apply button
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		// Loading few seconds here
		
		// New text is displayed on website
		
		// Use explicit wait on this specific element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		

//		// Convert array into Array List
//		List itemsNeededList = Arrays.asList(itemsNeeded);
//
//		// Find all elements with product-name
//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//
//		// Click
//
//		// Loop to click Cucumber
//		for (int i = 0; i < products.size(); i++) {
//			String name = products.get(i).getText().split("-")[0].trim();
//
//			if (itemsNeededList.contains(name)) {
//				driver.findElements(By.cssSelector("div.product-action")).get(i).click();
////					break;
//			}
//		}

	}

	// static void: we don't have to create new object to call method
	// Utility method
	public static void addItems(WebDriver driver, String[] products) {
		int count = 0;
		List<WebElement> productNameList = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productNameList.size(); i++) {
			for (int j = 0; j < products.length; j++)
				if (productNameList.get(i).getText().contains(products[j].toString())) {
					count++;
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					if (count == products.length)
						break;
				}
		}
	}
}
