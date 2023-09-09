package Selenium_Assesement_Sep09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create {
	EdgeDriver driver;

	@Test
	public void create()
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

		driver.get("https://api-training.atlassian.net/");	   
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com ");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click() ; 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click() ; 
		driver.findElement(By.xpath("//p[@data-testid='deep-dive-card-content--project-name-heading']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='createGlobalItem']"))).click();
		//driver.findElement(By.xpath("//button[@id='createGlobalItem']")).click();
		driver.findElement(By.xpath("//input[@id='summary-field']")).sendKeys("Test Auto Sep");
		//WebElement createBtn = driver.findElement(By.xpath("//button[@id='createGlobalItem']"));
		WebElement createBtn = driver.findElement(By.xpath("(//span[text()='Create'])[2]"));
		driver.executeScript("arguments[0].click();", createBtn);
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		driver.findElement(By.xpath("//input[@data-test-id='searchfield']")).clear();
		driver.findElement(By.xpath("//input[@data-test-id='searchfield']")).sendKeys("Test Auto Sep");
		driver.findElement(By.xpath("//input[@data-test-id='searchfield']")).sendKeys(Keys.ENTER);
		String text = driver.findElement(By.xpath("(//span/mark)[1]")).getText();
		String Exp = "Test Auto Sep";
		System.out.println(text);
		Assert.assertEquals(text, Exp);
		
		
	
	}

}
