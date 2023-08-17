package mandatoryHomeWork.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.time.Duration;

public class Day1 {

	@Test
	public void test1() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	//open my browser
    ChromeDriver driver=new ChromeDriver(options);
    
    //EdgeDriver driver=new EdgeDriver();
    
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
    
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
    
    driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
    
    driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
    
    driver.findElement(By.xpath(" //div[@data-name='Sales']")).click();
     
    WebElement account =driver.findElement(By.xpath("//span[text()='Accounts']"));
    driver.executeScript("arguments[0].click();", account);
 
    driver.findElement(By.xpath("//a[@title='New']")).click();
    
    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Ramya1");
    
    driver.findElement(By.xpath("  //button[@name='SaveEdit']")).click();
    

}
}
