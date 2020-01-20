package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIBank {
	
	public static void main(String[] args) throws Exception {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		// to find the web element //
		
		WebElement clk = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		
		clk.click();
		
		// to find the web element for login //
		
		WebElement sgn = driver.findElement(By.id("Button2"));
		
		sgn.click();
		
		
		// to handle the alert //
		
		Alert at = driver.switchTo().alert();
		
		// it will wait for 2 seconds and it will close //
		
		Thread.sleep(3000);
		
		at.accept();
		
	}

}
