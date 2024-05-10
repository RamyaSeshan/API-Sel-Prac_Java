package Subha_Assesement_JsonBinder;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSONReader {
	
	WebDriver driver ;
	
	@Test
	public void test1() throws IOException
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
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
		
		driver.findElement(By.xpath("//summary[text()='Table Data']")).click() ;
		
		driver.findElement(By.xpath("//textarea[@id='jsondata']")).clear() ;		
		
		  File file = new File ("./src/test/resources/testdata.json");
		  
		  JsonMapper map = new JsonMapper();
		  
		  JsonNode readTree = map.readTree(file);
		  
			driver.findElement(By.xpath("//textarea[@id='jsondata']")).sendKeys(map.readTree(file).toString()) ;
		  
			driver.findElement(By.xpath("//button[@id='refreshtable']")).click();
		  
		
	}

}
