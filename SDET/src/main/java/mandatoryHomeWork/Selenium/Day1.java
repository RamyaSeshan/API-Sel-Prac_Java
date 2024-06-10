package mandatoryHomeWork.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Day1 {

	EdgeDriver driver;
	@Test
	public void test1() throws InterruptedException {
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
	//open my browser
    //ChromeDriver driver=new ChromeDriver(options);
    
    //EdgeDriver driver=new EdgeDriver();
    
    //window max
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
    driver.manage().window().maximize();
    
    //wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    //load URL
    driver.get("https://login.salesforce.com/");
    
    //sendkeys() method pass values in textbox
    driver.findElement(By.id("username")).sendKeys("ranjini.r@testleaf.com");
    
    driver.findElement(By.id("password")).sendKeys("Testleaf$1234");
    
    driver.findElement(By.id("Login")).click();
    
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click(); // App Launcher
    
    driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click(); // View All
    
    driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
    
    driver.findElement(By.xpath(" //div[@data-name='Sales']")).click(); //
     
    WebElement account =driver.findElement(By.xpath("//span[text()='Accounts']"));
    driver.executeScript("arguments[0].click();", account);
 
    driver.findElement(By.xpath("//a[@title='New']")).click();
    
    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Ramya2");
    
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    

}
}
