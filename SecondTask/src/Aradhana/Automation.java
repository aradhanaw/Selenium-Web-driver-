package Aradhana;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation {
	@Test
	public static void youtube() throws InterruptedException {
		System.out.println("this is youtube search");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Nepali Song");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.RETURN);
		
		
		
		
		
	}

}
