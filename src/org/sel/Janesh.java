package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janesh {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows 11\\workspace\\Selli\\lib2\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
		org.openqa.selenium.Alert  a =driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(3000);
		a.dismiss();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to demonstrate the prompt box ')])")).click();
        String print = a.getText();
        System.out.println(print);
        
        Thread.sleep(3000);
        a.sendKeys("suresh");
        a.accept();
        
        TakesScreenshot  tk = (TakesScreenshot) driver;
        File sor = tk.getScreenshotAs(OutputType.FILE);
        File des = new File ("C:\\Users\\Windows 11\\workspace\\Selli\\lib2\\Screen.png");
        FileUtils.copyFile(sor, des);
        
        Thread.sleep(3000);
        driver.quit();
      
      
	
	}

}
