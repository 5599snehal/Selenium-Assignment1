package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://signup.heroku.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("first_name")).sendKeys("snehal");
		Thread.sleep(3000);
		driver.findElement(By.id("first_name")).clear();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
