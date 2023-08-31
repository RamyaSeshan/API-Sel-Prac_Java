package Selenium_Marathon.WorkType_Groups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC002 {


	@Test
	public void CreateWork_Type_Group() throws InterruptedException //
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(options);  
		driver.manage().window().maximize(); 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   

		driver.get("https://login.salesforce.com/");	   
		driver.findElement(By.id("username")).sendKeys("ramyaseshan01@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Appa@1948");	    
		driver.findElement(By.id("Login")).click();

		driver.findElement(By.xpath("//div[@role='navigation']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();

		WebElement WT_Groups = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
		wait.until(ExpectedConditions.visibilityOf(WT_Groups));
		Actions act = new Actions(driver);
		act.scrollToElement(WT_Groups).perform();

		WT_Groups.click();		

		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Ramya");
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(Keys.TAB);

		
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon')]")).click();
		
		WebElement ActionBtn = driver.findElement(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon')]"));
		wait.until(ExpectedConditions.elementToBeClickable(ActionBtn));	
		ActionBtn.click();
		
		
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");

		//WebElement Work_Grp_Type = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')]"));
		//driver.executeScript("arguments[0].click();", Work_Grp_Type);
		//act.sendKeys(Keys.DOWN,Keys.RETURN).perform();
		
		WebElement Work_Grp_Type = driver.findElement(By.xpath("//button[@role='combobox']"));
		driver.executeScript("arguments[0].click();", Work_Grp_Type);		
		driver.findElement(By.xpath("//span[@title='Capacity']")).click();

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		
	}
}
