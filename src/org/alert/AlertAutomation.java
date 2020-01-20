package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {
	
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		// to find the element //
		
		WebElement clk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		clk.click();
		
		//to handle the alet box //
		
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		 // to click ok button on alert //
		
		al.accept();
		
		// to find the web element for ok & cancel //
		
		WebElement ok = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		ok.click();
		
		// to find the element for confirm box //
		
		WebElement con = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		con.click();
		
		// to handle the alert box //
		
          al.dismiss();
          
          // to find the elment for text box //
          
          WebElement txt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
          
          txt.click();
          
          // to find the web element for prompt button //
          
          WebElement tt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
          
          tt.click();
          
          // to handle the alert by sending txt //
          
        Thread.sleep(3000);
          
          al.sendKeys("priya");
          
          al.accept();
          
          
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


