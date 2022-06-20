package Section11_RealTimeExercises;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e1 {

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
		
		// 1. Count how many links in entire page
		// tag name: a
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count = links.size();
		
		// Add assertion
		System.out.println(count);
		Assert.assertEquals(27, count);
		
		// 2. Count how many links in footer section
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("div.footer_top_agile_w3ls a"));
		
		int countFooterLinks = footerLinks.size();
		// Add assertion
		System.out.println(countFooterLinks);
		Assert.assertEquals(20, countFooterLinks);
		
		// 2. Count how many links in footer section => limit web driver scope
		// Get the web element for footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		// Get all web elements with tag name a in footer web element
		List<WebElement> newFooterLinks = footer.findElements(By.tagName("a"));
		
		// Count
		int countNewFooterLinks = newFooterLinks.size();
		// Add assertion
		System.out.println(countNewFooterLinks);
		Assert.assertEquals(20, countNewFooterLinks);
		
		// 3. Count how many links in footer section in 1st column => limit web driver scope
	
		// Get all web elements with tag name a in footer web element
		//WebElement newFooterLinksIn1stColumn = footer.findElement(By.xpath("(//div[@id='gf-BIG']//tr//td)[1]"));
		WebElement newFooterLinksIn1stColumn = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		List<WebElement> a1 = newFooterLinksIn1stColumn.findElements(By.tagName("a"));
				
		// Count
		int countNewFooterLinks1stColumn = a1.size();
		// Add assertion
		System.out.println(countNewFooterLinks1stColumn);
		Assert.assertEquals(5, countNewFooterLinks1stColumn);
		
		// 4. Click on each link in the column and check if the pages are working
		// 5. Go on each tab and get title
		String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for(int i = 1; i < a1.size(); i++) {
			
			a1.get(i).sendKeys(clickOnLinkTab);
			
			
		}
		
		// From parent windows , switch to child windows
		// Switch to child window 
		Set<String> windows = driver.getWindowHandles();	//[parentId, childId] 
		Iterator<String> it = windows.iterator(); 
//		String parentId = it.next(); 
//		String childId = it.next(); 
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		

		
	}

}
