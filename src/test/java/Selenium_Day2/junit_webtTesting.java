package Selenium_Day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junit_webtTesting {
	
	WebDriver driver;
	
	@Before
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://techcircleschool.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
	}
	
	@After
	public void afterTest() {
	//	driver.close();
	}

}
