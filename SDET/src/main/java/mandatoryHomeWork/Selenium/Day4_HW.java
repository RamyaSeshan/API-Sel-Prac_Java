package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day4_HW {


	@Test
	 public void TestA() throws InterruptedException
	 {
	   ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	   ChromeDriver driver = new ChromeDriver(options);
	   
	 //window max
	   driver.manage().window().maximize();   
	   //wait
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
	   //load URL
	   driver.get("https://login.salesforce.com/");   
	   //sendkeys() method pass values in textbox
	   driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");   
	   driver.findElement(By.id("password")).sendKeys("Leaf$1234");   
	   driver.findElement(By.id("Login")).click();
	   
	   driver.findElement(By.xpath("//div[@role='navigation']")).click();
	   driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Content");
	   driver.findElement(By.xpath("//p[text()='Salesforce CRM Content']")).click();
	   Thread.sleep(6000);  
	   
	   WebElement account =driver.findElement(By.xpath("//span[text()='Chatter']"));
	    driver.executeScript("arguments[0].click();", account);
	   //driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Feed']/a[@title='Chatter')).click();
	 //one-app-nav-bar-item-root[@data-id='Feed']/a[href='/lightning/page/chatter']
	   
	 // driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Feed']/a[@title='Chatter']")).click();
	  //driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Feed']/a[@title='Chatter']")).click();
	   //driver.findElement(By.xpath("//span[text()='Chatter']")).click();
	  //driver.findElement(By.xpath("//a[@title='Chatter']")).click();
	   driver.findElement(By.xpath("//span[text()='Question']")).click();
	   driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("This is actual");
	   driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("question");
	   driver.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
	   String text = driver.findElement(By.xpath("(//div/span[@class='uiOutputText'])[1]")).getText();
	   System.out.println(text);
	   String Expected = "This is actual";
	   Assert.assertEquals(Expected, text);
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}
