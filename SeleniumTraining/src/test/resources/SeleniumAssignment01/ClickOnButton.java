package SeleniumAssignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign up")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
