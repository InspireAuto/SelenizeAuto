package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTestCase extends HomePage {

	@BeforeTest
	public void browserLaun() {
		System.out.println("browser launched");
	}

	@Test
	public void loginTC() {
		enterCredentials();
		System.out.println("Home Test cases");
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}
