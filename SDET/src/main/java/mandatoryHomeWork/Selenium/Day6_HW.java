package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6 {

	@Test
	 public void TestA() throws InterruptedException
	 {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();		
	
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		
		alert.accept();
				
		 String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		 String Expected = "You pressed OK!";
		 System.out.println(text);
		 Assert.assertEquals(text, Expected);
		 
		
		
		
		  
		  
		  
	 }
	
}
