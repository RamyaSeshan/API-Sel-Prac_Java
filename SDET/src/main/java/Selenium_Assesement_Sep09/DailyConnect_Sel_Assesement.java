package Selenium_Assesement_Sep09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DailyConnect_Sel_Assesement {

	
	EdgeDriver driver;

	@Test
	public void create()
	{
		ChromeOptions options = new ChromeOptions();
	
		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();	
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

		driver.get("https://www.leafground.com/table.xhtml");	 
		
		////div[@class='ui-widget-header ui-datatable-scrollable-header']
		
		List<WebElement> header  = driver.findElements(By.xpath("//div[@class='ui-widget-header ui-datatable-scrollable-header']")) ;
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']")) ;
		
		
}
	
}
