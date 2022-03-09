package Selenium_Day2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class junitTestingExample {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before test runs");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After test runs");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("BeforeTest");
	}
	
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	
	@After
	public void afterMethod() {
		System.out.println("AfterTest");
	}
	
	

}
