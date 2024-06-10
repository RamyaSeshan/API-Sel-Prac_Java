package mandatoryHomeWork.Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6_HW
{

	@Test
	 public void TestA() throws InterruptedException //
, IOException
	 {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();		
	  
		File src = driver.getScreenshotAs(OutputType.FILE) ;
		File dest = new File ("./snaps/img1.png") ;
		FileHandler.copy(src, dest) ;
		
		Alert alert = driver.switchTo().alert();
		
		File src1 = driver.getScreenshotAs(OutputType.FILE) ;
		File dest1 = new File ("./snaps/img1.png") ;
		FileHandler.copy(src1, dest1) ;
		
		String AlertText = alert.getText();
		System.out.println(AlertText);
		
		alert.accept();
				
		 String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		 String Expected = "You pressed OK!";
		 System.out.println(text);
		 Assert.assertEquals(text, Expected);
		 
		
		  
	 }
	
}
