package selenium3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {
	public void addCart(WebDriver driver, String[] products) {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		// // Maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Array contains list of items
		String[] itemsNeeded = { "Cauliflower", "Cucumber" };

		// Find all elements with product-name
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// Loop to click Cucumber
		for (int i = 0; i < products.size(); i++) {

			String productName = products.get(i).getText();

			// Check whether name you extracted is presented in array or not
			// we need to convert array into array list
			for (int j = 0; j < itemsNeeded.length; j++) {
				if (productName.contains(itemsNeeded[j].toString())) {
					System.out.println(driver.findElements(By.cssSelector("h4.product-name")).get(i).getText());
					driver.findElements(By.cssSelector("div.product-action")).get(i)
							.click();
//					break;
				}
			}

//    	if(productName.contains("Cucumber")) {
//    		// We got the index of Cucumber product here ==> i
//    		// Click to Add to cart 1 time
//    		// Current 
//    		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//    		break;
//    	}
		}

	}

}
