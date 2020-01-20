package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBank {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\java and eclipse 32 bit\\java_workspace\\Selenium\\Driver\\chromedriver.exe");
		
		// to create an object//
		
		WebDriver driver = new ChromeDriver();
		
		// to launch//
		
		Thread.sleep(4000);
		
driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n");
	

        // to find the web element //

           WebElement id = driver.findElement(By.id("DUMMY1"));
           
           id.click();

       
        WebElement user = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
        
       
       user.click();
        
       //Thread.sleep(3000);

       WebElement sgn = driver.findElement(By.xpath("(//input[@title='Log In'])[1]"));
        
       
        sgn.click();
        
        // to handle the alert //
        
        Alert at = driver.switchTo().alert();
        
        Thread.sleep(3000);
        
        at.accept();
	}

}
