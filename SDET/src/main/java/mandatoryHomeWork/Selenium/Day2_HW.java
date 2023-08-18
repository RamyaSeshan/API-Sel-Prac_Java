package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day2_HW {

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
   driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Dashboard");
   driver.findElement(By.xpath(" //mark[text()='Dashboard']")).click();

   //driver.findElement(By.xpath("//a[@data-label='Dashboards']")).click();
   driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
   Thread.sleep(5000);
   //driver.switchTo().frame("sfxdash-1692353550714-138722");
   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
 
   driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce Automation by Ramya -- Traial I " );
   driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
   


   
}
 
}
