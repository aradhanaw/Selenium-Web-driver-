package Aradhana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	 @Test
	    public static void loginSystem() throws InterruptedException {
	        String url="https://rahulshettyacademy.com/loginpagePractise/";
	        WebDriverManager.chromedriver().setup();  //dependency
	        ChromeDriver driver=new ChromeDriver();
	        driver.get(url);
	        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //only one time use
	        
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
	        driver.findElement(By.xpath("//input[@name='terms']")).click();
	        driver.findElement(By.xpath("//input[@name='signin']")).click();
	        
	        WebDriverWait objWait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        objWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("carouselExampleIndicators")));
	        
	        
	 }
}
