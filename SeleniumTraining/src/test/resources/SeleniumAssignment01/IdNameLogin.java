package SeleniumAssignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdNameLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("<a href=\"https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzM2OTM2NzEwLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login&amp;next\">Forgotten password?</a>")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("_97w4")).click();
		
    
		
		



	}

}
