package Aradhana;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	@Test
	public static void JS_Alert() {
		String url = "https://demo.guru99.com/test/delete_customer.php";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver aradh = new ChromeDriver();
		aradh.get(url);
		
		aradh.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("tina");
		aradh.findElement(By.xpath("//input[@name='submit']")).click();
		
		org.openqa.selenium.Alert al = aradh.switchTo().alert();
		String altext = al.getText();
		System.out.println(altext);
		al.accept();
		aradh.close();	}

}
