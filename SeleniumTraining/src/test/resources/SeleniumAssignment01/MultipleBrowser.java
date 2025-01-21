package SeleniumAssignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
        driver.get("https://www.google.com/chrome/");
        Thread.sleep(3000);
        driver.get("https://www.microsoft.com/en-us/edge?form=MA13FJ");
        Thread.sleep(3000);
        driver.get("https://www.mozilla.org/en-US/firefox/");
		driver.quit();
		
		
   }

}
