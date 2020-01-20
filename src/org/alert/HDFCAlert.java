package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCAlert {
	
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		// to find the element for continue //
		
		Thread.sleep(4000);
		
		WebElement con = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
		con.click();
		
		
		
	}

}
