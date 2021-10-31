package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericutils.ExcelUtility;

public class BigBillion {
	@Test
	public void demo() throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		ExcelUtility elib = new ExcelUtility();
		String element = elib.getExcelData("sheet1", 0, 1);
		String element2 = elib.getExcelData("sheet1", 1, 1);
		  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(element);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(element2);
		 driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		//	wait.until(ExpectedConditions.elementToBeClickable((By.xpath("(//div[@class='xtXmba'])[3]")))).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]")).click();
			
			
		 
		
			
		 
	
		}
	
}

