package Aradhana;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blazedemo {
	@Test
	public static void FlightBooking() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String url ="https://blazedemo.com/";
		
		driver.get(url);
		//departure hune place select garne
		Select dep = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		dep.selectByValue("Boston");
		//dep.selectByVisibleText("San Diego");
		
		//destination hune place select garne
		Select dest = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		dest.selectByIndex(4);
		
		//find flights click garcha
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//navigated to flight selection page
		//indexing ko 3rd number ko flight select garcha
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		
		//for name input
		driver.findElement(By.id("inputName")).sendKeys("Ara Wagle");
		
		//for address input
		driver.findElement(By.id("address")).sendKeys("Nepal");
		
		//for city input
		driver.findElement(By.id("city")).sendKeys("KTM");
		
		//for state input
		driver.findElement(By.id("state")).sendKeys("State 03");
		
		//for zip code input
		driver.findElement(By.id("zipCode")).sendKeys("25123");
		
		//for selecting cardtype
		Select cardtype = new Select(driver.findElement(By.id("cardType")));
		//cardtype.selectByValue("visa")
		//cardtype.selectByIndex(2);
		cardtype.selectByVisibleText("Visa");
		
		//card ko number input garna lai
		driver.findElement(By.id("creditCardNumber")).sendKeys("120 4585 5621");
		
		//for card's valid month
		driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		
		//for card's valid year
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		
		//for card ma bhako name
		driver.findElement(By.id("nameOnCard")).sendKeys("Ara Wagle");
		
		//to click remember me 
		driver.findElement(By.id("rememberMe")).click();
		
		//To click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//objjj new object
		WebDriverWait objjj = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//To verify if ticket is being purched or not.
		objjj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]")));
		
		
	}

}
