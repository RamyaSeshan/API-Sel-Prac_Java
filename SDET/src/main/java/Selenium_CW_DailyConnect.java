import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_CW_DailyConnect {

	@Test
	 public void TestA() throws InterruptedException
	 {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	    Select S = new Select(findElement);
	    boolean multiple = S.isMultiple();
	    System.out.println("Given Drop down DO NOT has mul select option" +multiple);

	    List<WebElement> options = S.getOptions();	    
	    
	    for (WebElement webElement : options) {
	    	System.out.println(webElement.getText());	
	    	
		}
	
}
	
}
