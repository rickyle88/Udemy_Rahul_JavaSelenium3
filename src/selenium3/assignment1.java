package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./re/chromedriver.exe"); 
		
		

		WebDriver driver = new ChromeDriver();
//		
//		// Maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// click on assignment link
//		WebElement practiceURL = driver.findElement(By.xpath("//a[text()='Automation Practise - 3']"));
//		practiceURL.click();
		
		// Enter name
		WebElement name = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']"));
		name.sendKeys("Nguyen Le");
		
		// Enter email
		WebElement password = driver.findElement(By.xpath("//div[@class='form-group']/input[@type='password']"));
		password.sendKeys("ail.com");
		
		// Select gender
		WebElement genderOption = driver.findElement(By.id("exampleFormControlSelect1"));
		Select genderDropDown = new Select(genderOption);
		
		genderDropDown.selectByVisibleText("Male");
		
		// DOB
		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("02/02/1992");

		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
