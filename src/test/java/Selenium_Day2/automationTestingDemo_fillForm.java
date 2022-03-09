package Selenium_Day2;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationTestingDemo_fillForm {
	
	WebDriver driver;

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@Test
	public void popUp() {
		//pop-up exit
		driver.findElement(By.xpath("//*[@id=\"modal-1-content\"]/button")).click();
//		Set<String> wnd = driver.getWindowHandles();
//		Iterator<String> i = wnd.iterator();
//		String prntw = i.next();
//		String popwnd = i.next();
//		driver.switchTo().window(popwnd);
//		System.out.println("Page title of popup: " + driver.getTitle());
//		driver.close();
//		
//		driver.switchTo().window(prntw);
//		System.out.println("Page title of parent window: " + driver.getTitle());
//		//driver.quit();
		
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"accept-cookie-policy\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/a")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1050)", "");
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Hank");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Hill");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hankhill@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("453-345-3456");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[@value=\"8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Here");
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Hello how are you");
	}
	

	
	@After
	public void afterMethod() {
	//	driver.close();
	}
	
}
