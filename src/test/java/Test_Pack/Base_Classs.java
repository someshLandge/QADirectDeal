package Test_Pack;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility_PACK.Reusable_details;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class Base_Classs {

	@Test
	public static void setUp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://reactdirectdeals.uat-projects.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[normalize-space()='Sign In / Register']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Signup']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		String email = Reusable_details.reusableEmail();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(Reusable_details.reusableMobile());
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("confirmPassword")).sendKeys("Test@123");

		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		WebElement emailFiel_Profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fieldEmail")));
//
//		String profileEmailValue = emailFiel_Profile.getAttribute("value");
		

	
		Thread.sleep(5000);
	//	driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		// Assert.assertEquals(driver.findElement(By.id("fieldName")).getAttribute("value"),
		// "Test");

		// driver.findElement(By.id("fieldEmail")).getAttribute("value");

		// Assert.assertEquals(driver.findElement(By.id("fieldEmail")).getAttribute("value"),
		// email);
		
//		Assert.assertEquals(profileEmailValue, email);
//		System.out.println("Test passed! The email matches: " + profileEmailValue);

	}
}
