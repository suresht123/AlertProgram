package org.sel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhand {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 11\\workspace\\Selli\\lib2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver () ; 
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	
	    Thread.sleep(3000);
	    
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("REALME MOBLIES");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    Thread.sleep(3000);
	    
	 
	    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	    String st = driver.getWindowHandle();
	    driver.switchTo().window(st);
	    

	    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	    driver.switchTo().window(st);
	    
	    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
	   
	    driver.switchTo().window(st);
	    
	    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]")).click();
	    
	    driver.switchTo().window(st);
	
	   Set<String> child = driver.getWindowHandles();
	   List <String> child1 = new ArrayList(child);
	   for(int i = 1; i<5; i++) {
		   driver.switchTo().window(child1.get(i));
		   String text = driver.findElement(By.xpath("//span[class='B_NuCI']")).getText();
		   System.out.println(text);
		   driver.close();
		   
		   
	   }
	   
	    
	
	}
	
	
	

}
