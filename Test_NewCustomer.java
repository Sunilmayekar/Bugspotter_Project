package Test001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test_NewCustomer extends All_Methods{
 
	public static void main(String[] args) {
	
	//	All_Methods.BrowserOpen("https://www.demo.guru99.com/V4/manager/addcustomerpage.php");
		All_Methods.BrowserOpen("http://www.demo.guru99.com/V4/");
		All_Methods.Login("mngr470382", "AdyzaqU");
		
		
    //driver.switchTo().newWindow()
	driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	//driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("//input[@type='text']")).click();
	
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jhony deep");
	WebElement male=	driver.findElement(By.xpath("//input[@name='rad1']"));
	//WebElement female=	driver.findElement(By.xpath("//input[@name='rad2']"));	
	male.click();
	
	driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("09/23/1997");
	driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("pune");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("pune");
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys("maharastra");
	driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("416101");
	driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test1234@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1234");
	driver.findElement(By.xpath("//input[@name='sub']")).click();
	}

}
