package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/");
		
		// static drop down if tagname = select
		WebElement staticDropDownCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// create object of Select class
		Select dropdown = new Select(staticDropDownCurrency);
		
		// select index 3 (USD)
		dropdown.selectByIndex(3);
		
		// extract the text of web element
		
		// USD
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// select by value text
		dropdown.selectByValue("AED");
		// select by visible text
		dropdown.selectByVisibleText("USD");
		
		
		
		// AED
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// select by value
		dropdown.selectByValue("INR");
		// AED
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}

}
