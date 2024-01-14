package SampleTest;

import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametirization {
	
	RemoteWebDriver driver ;

	@Parameters ( {"url" ,"username" , "password" , "browser"})
	@Test 
	public void Test2test(String U , String UN , String PW , String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{ 
			System.out.println( "Tests will run in Chrome  " ); 
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver() ;
			//driver.get("https://www.demoqa.com");
		}
		else if (browser.equalsIgnoreCase("edge"))		
		{ 
			System.out.println( "Tests will run in edge  " );  
			driver = new EdgeDriver() ;
		}
		
		System.out.println( "This is totest from Test 2 class " + new Date() );
		System.out.println(" URL is   " + U);
		System.out.println(" UserName is  is   " + UN);
		System.out.println(" Password  is   " + PW);
	}	

}
