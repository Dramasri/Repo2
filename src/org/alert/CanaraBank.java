package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
	
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		// to find the web element for sign in //
		
		WebElement sgn = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		
		Thread.sleep(2000);
		
		sgn.click();
		
		// to handle the alert //
		
		Alert at = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		at.accept();
		
		
	}

}
