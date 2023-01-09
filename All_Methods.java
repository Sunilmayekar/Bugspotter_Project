package Test001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Methods {
     static WebDriver driver;
	
      public static void BrowserOpen(String URL) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

      public static void Login(String username,String passkey) {
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(passkey);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
	}
}
