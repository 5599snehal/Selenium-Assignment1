package SeleniumAssignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://signup.heroku.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text'][@name='first_name']")).sendKeys("Selenium");
		
    
		
		



	}

}
