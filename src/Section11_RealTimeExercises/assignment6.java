package Section11_RealTimeExercises;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment6 {

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
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// 1. Checkbox Example: Select any checkbox, output the lable
		// 2. Dropdown Example: Select an option (value is from #1)
		// 3. Switch to Alert Example: Enter value from #1, click Alert button
		// 4. click Alert button, verify value must match step 2
		
		
		// Click check box and get text
		WebElement chk1 = driver.findElement(By.id("checkBoxOption1"));
		chk1.click();
		
		WebElement lbl1 = driver.findElement(By.cssSelector("label[for='bmw']"));
		String lbl1Text = lbl1.getText().trim();
		
		// Dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		
		s.selectByVisibleText(lbl1Text);
		
		// Alert
		WebElement name = driver.findElement(By.id("name"));
		
		name.sendKeys(lbl1Text);
		
		// Click Alert button
		WebElement btnAlert = driver.findElement(By.id("alertbtn"));
		btnAlert.click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText().split(",")[0].split(" ")[1];
		
		Assert.assertEquals(lbl1Text, alertText);
				
		alert.accept();
		
		System.out.println(alertText);
		
		
		
//		System.out.println("Hello");
//		// 1. Count how many links in entire page
//		// tag name: a
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		int count = links.size();
//		
//		// Add assertion
//		System.out.println(count);
//		Assert.assertEquals(27, count);
//		
//		// 2. Count how many links in footer section
//		List<WebElement> footerLinks = driver.findElements(By.cssSelector("div.footer_top_agile_w3ls a"));
//		
//		int countFooterLinks = footerLinks.size();
//		// Add assertion
//		System.out.println(countFooterLinks);
//		Assert.assertEquals(20, countFooterLinks);
//		
//		// 2. Count how many links in footer section => limit web driver scope
//		// Get the web element for footer
//		WebElement footer = driver.findElement(By.id("gf-BIG"));
//		
//		// Get all web elements with tag name a in footer web element
//		List<WebElement> newFooterLinks = footer.findElements(By.tagName("a"));
//		
//		// Count
//		int countNewFooterLinks = newFooterLinks.size();
//		// Add assertion
//		System.out.println(countNewFooterLinks);
//		Assert.assertEquals(20, countNewFooterLinks);
//		
//		// 3. Count how many links in footer section in 1st column => limit web driver scope
//	
//		// Get all web elements with tag name a in footer web element
//		//WebElement newFooterLinksIn1stColumn = footer.findElement(By.xpath("(//div[@id='gf-BIG']//tr//td)[1]"));
//		WebElement newFooterLinksIn1stColumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		
//		List<WebElement> a1 = newFooterLinksIn1stColumn.findElements(By.tagName("a"));
//				
//		// Count
//		int countNewFooterLinks1stColumn = a1.size();
//		// Add assertion
//		System.out.println(countNewFooterLinks1stColumn);
//		Assert.assertEquals(5, countNewFooterLinks1stColumn);
//		
//		// 4. Click on each link in the column and check if the pages are working
//		// 5. Go on each tab and get title
//		String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
//		for(int i = 1; i < a1.size(); i++) {
//			
//			a1.get(i).sendKeys(clickOnLinkTab);
//			
//			
//		}
//		
//		// From parent windows , switch to child windows
//		// Switch to child window 
//		Set<String> windows = driver.getWindowHandles();	//[parentId, childId] 
//		Iterator<String> it = windows.iterator(); 
////		String parentId = it.next(); 
////		String childId = it.next(); 
//		while(it.hasNext()) {
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//		}
//		
		
		

		
	}

}
