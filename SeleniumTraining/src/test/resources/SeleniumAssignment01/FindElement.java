package SeleniumAssignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("snehadhigare@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("goodgirl");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
