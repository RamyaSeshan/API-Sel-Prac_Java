package mandatoryHomeWork.Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day7_HW {

	@Test
	public void test1() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(options);  
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   

		driver.get("https://login.salesforce.com/");    
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();

		//driver.findElement(By.xpath("/span[text()='Learn More']")).click();
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();


		Set<String> windowHandles = driver.getWindowHandles();		
		List<String> list = new ArrayList<String>(windowHandles);
		for (String windowhadlename : list) {
			System.out.println("windowhadlename  is ---" +windowhadlename);
		}

		

			driver.switchTo().window(list.get(1));
			//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();

			//Thread.sleep(5000);
			String ChildWinTitle = driver.getTitle();
			System.out.println("Child Window Title ---> "+ ChildWinTitle);	
			driver.close();
			
			driver.switchTo().window(list.get(0));
			String ParentWinTitle = driver.getTitle();
			System.out.println("Parent Window Title ---> "+ ParentWinTitle);
	
	}

	}




