package Selenium_Assesement_Sep09;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertScreenShot {
	
	EdgeDriver driver;

	@Test
	public void create() throws AWTException, IOException 
	{
		ChromeOptions options = new ChromeOptions();
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("116.0.5845.180").setup();
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		
		//options.addArguments("--disable-notifications");   
		//driver=new ChromeDriver(options);  
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();		
	  
		/*File src = driver.getScreenshotAs(OutputType.FILE) ;
		File dest = new File ("./snaps/img1.png") ;
		FileHandler.copy(src, dest) ; */
		
		Alert alert = driver.switchTo().alert();	
		
				 
			Robot r = new Robot();
			// this is grt the screen size
			Rectangle rect = new Rectangle(  Toolkit.getDefaultToolkit().getScreenSize()) ;
			BufferedImage createScreenCapture = r.createScreenCapture(rect) ;
			ImageIO.write(createScreenCapture, "png", new File ("./snaps/img1.png") ) ;		   			
		
		
		String AlertText = alert.getText();
		System.out.println(" AlertText is --- >>> "+AlertText);
		
		alert.accept();		
		
		 String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		 String Expected = "You pressed OK!";
		 System.out.println(text);
		 Assert.assertEquals(text, Expected);
		 

	}

}
