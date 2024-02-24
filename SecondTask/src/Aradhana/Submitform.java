package Aradhana;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submitform {
	@Test
	public static void signup() {
		String url = "https://rahulshettyacademy.com/angularpractice/";
		WebDriverManager.chromedriver().setup();

		 ChromeDriver main=new ChromeDriver();

		 main.get(url);

		 main.findElement(By.name("name")).sendKeys("Me"); 

		 main.findElement(By.name("email")).sendKeys("me@gmail.com");

		 main.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("me234A");

		 Select gen = new Select(main.findElement(By.id("exampleFormControlSelect1")));

		 gen.selectByIndex(1);
		 main.findElement(By.id("inlineRadio1")).click();
		 main.findElement(By.xpath("//input[@type='date']")).sendKeys("01312024");

		 main.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
