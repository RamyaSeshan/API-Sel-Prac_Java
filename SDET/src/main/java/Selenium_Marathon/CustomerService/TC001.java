package Selenium_Marathon.CustomerService;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class TC001 {
	ChromeDriver driver;
	
	@Test
	public void Customer_Service_Options() throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		 driver=new ChromeDriver(options);  
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
           
		//1. Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");	   
		driver.findElement(By.id("username")).sendKeys("ramyaseshan01@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Appa@1948");	    
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWinHandle = new ArrayList<String>(windowHandles);
		for (String windowsValues : allWinHandle) {
			System.out.println(windowsValues);
		}

      driver.switchTo().window(allWinHandle.get(1));
      driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
      
      Shadow dom=new Shadow(driver); 
      
      WebElement products = dom.findElementByXPath("//span[text()='Products']");      
      products.click();
      String title = driver.getTitle();
      System.out.println(title);
      
      Thread.sleep(5000);
     //dom.findElement(By.xpath("//span[text()='Service']"));
      WebElement serviceTab = dom.findElementByXPath("//span[text()='Service']");
      
      //wait.until(ExpectedConditions.visibilityOf(service));      
      Actions act = new Actions(driver);
      act.moveToElement(serviceTab).perform();
      
      boolean serviceCloud = dom.findElementByXPath("//a[text()='Service Cloud']").isDisplayed();
      System.out.println("serviceCloud is displayed ..... " +serviceCloud);
 
      boolean selfService = dom.findElementByXPath("//a[text()='Self-Service']").isDisplayed();
      System.out.println("serviceCloud is displayed ..... " +selfService);
      
  

}
	}
