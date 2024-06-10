package Sel_NYKAA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerfumeList {

	private static final ThreadLocal<RemoteWebDriver> wd = new ThreadLocal<RemoteWebDriver>();

	public void setDriver(String browser) {
		switch (browser) {
		case "chrome":
			if (browser.equalsIgnoreCase("chrome"))
				wd.set(new ChromeDriver());
			break;
		case "edge":
			if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				wd.set(new EdgeDriver());
			}
			break;
		case "firefox":
			if (browser.equalsIgnoreCase("firefox"))
				wd.set(new FirefoxDriver());
			break;
		default:
			wd.set(new ChromeDriver());
			break;
		}

	}

	public RemoteWebDriver getDriver() {
		return wd.get();
	}

	public void launchBrowser(String URL, String browserType) {
		if (browserType.equalsIgnoreCase("edge"))
			setDriver("edge");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get(URL);
	}

	@Test
	public void test2() {
		launchBrowser("https://www.nykaa.com/fragrance/women/perfumes-edt-edp/c/962", "edge");
		// System.out.println("---------" +Thread.getAllStackTraces() );
	}

	@Test
	public void test3() {
		launchBrowser("https://www.nykaa.com/fragrance/women/perfumes-edt-edp/c/962", "edge");
		// System.out.println("---------" +Thread.getAllStackTraces() );
	}

	
	  @Test public void test1() { WebDriver driver = new EdgeDriver() ;
	  driver.get("https://www.nykaa.com/fragrance/women/perfumes-edt-edp/c/962");
	  driver.manage().window().maximize() ;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)) ;
	  
	  /*List<WebElement> perfumeNames = driver.findElements(By.xpath("//div[@class='css-xrzmfa']")) ;
	  
	  for (WebElement name : perfumeNames) {
	  System.out.println("Name of the Perfume is  " + name ); } */
	  
	  WebElement container = 	  driver.findElement(By.xpath("//div[@class='css-1rd7vky']")) ;
	  List<WebElement> perfumeNames = container.findElements(By.xpath("//div[@class='css-xrzmfa']"));
	  List<WebElement> originalPrice = container.findElements(By.xpath("//div[@class='css-1d0jf8e']/span/span"));
	  List<WebElement> discoutPrice = container.findElements(By.xpath("//div[@class='css-1d0jf8e']/span[2]"));
	  List<WebElement> discoutRate = container.findElements(By.xpath("//div[@class='css-1d0jf8e']/span[3]"));
	  
	  
	  for (int i = 0; i < perfumeNames.size() ; i++) 
	  { 
	  String Name =  perfumeNames.get(i).getText() ; 
	  String price = null; 
	  String discountedPrice = null ;
	  String dicntRate = null;
	  
	  if (i < originalPrice.size()) { price = originalPrice.get(i).getText() ; }
	  else { price = "0" ; }
	  
	  if (i < discoutPrice.size()) { discountedPrice =
	  discoutPrice.get(i).getText() ; } else { discountedPrice = "0" ; }
	  
	  if (i < discoutRate.size()) { dicntRate = discoutRate.get(i).getText() ; }
	  else { dicntRate = "0" ; }  
	  
	  
	  System.out.println( "Item no  " + i + "   perfumeNames  is  " +Name +
	  "   originalPrice is  " + price + "  discoutPrice  is  " + discountedPrice +
	  "  discoutRate  is  " + dicntRate
	  
	  ); 
	  
	  } }
	  
	 
}
