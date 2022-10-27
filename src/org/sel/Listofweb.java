package org.sel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listofweb {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 11\\workspace\\Selli\\lib2\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("VIVO T1X");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
}
}
