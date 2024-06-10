package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day8_HW {

	@Test
	public void test_dragAndDropBy() { //

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(options);  
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   

		driver.get("https://jqueryui.com/draggable/");  
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement DragElement = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);

		act.dragAndDropBy(DragElement, 100, 0).perform();
	}

	@Test
	public void test_droppable() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(options);  
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   

		driver.get("https://jqueryui.com/droppable");  
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement DragElement = driver.findElement(By.id("draggable"));
		WebElement DropElement = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);

		act.dragAndDrop(DragElement, DropElement).perform();	
	}

	@Test
	public void test_selectable() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver=new ChromeDriver(options);  
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   

		driver.get("https://jqueryui.com/selectable");  
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement Item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).keyUp(Keys.CONTROL).perform();
	}
}
