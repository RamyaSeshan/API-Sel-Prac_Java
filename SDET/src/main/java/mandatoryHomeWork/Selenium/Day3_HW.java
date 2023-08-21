package mandatoryHomeWork.Selenium;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day3_HW {
	
	 LocalDate newDate =  LocalDate.now();
	 LocalDate newDate1 =  LocalDate.now().plusDays(1);  //2023-08-21

	  String stringDt = newDate.toString();
	  String stringDtT = newDate1.toString();

	
	@Test
	 public void TestA()
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
	   driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Campaigns");
	   
	   driver.findElement(By.xpath("//mark[text()='Campaigns']")).click();
	   driver.findElement(By.xpath("//div[text()='New']")).click();
	   driver.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("AA@Bb-Trial.com");  
	   //driver.findElement(By.xpath("(//a[@class='datePicker-openIcon display'])[1]")).sendKeys("8/20/2023"); 
	   driver.findElement(By.xpath("(//input[@class=' input'])[2]")).sendKeys(stringDt);
	   driver.findElement(By.xpath("(//input[@class=' input'])[3]")).sendKeys(stringDtT);
	   driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	   
	 
	     
	
}
}
