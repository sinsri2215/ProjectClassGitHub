package org.libGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libGlobal {
	
	WebDriver driver; //instance variable
	
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    return driver;
		
	}
	public void maximizewindow() {
		driver.manage().window().maximize();
		
	}
	public void loadurl(String url) {
		driver.get(url);

	}
	public void typetext(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	public void btnLogin(WebElement e) {
		e.click();
		

	}
	public void quitBrowser() {
		driver.quit();
		

	}
	public String getAttributeValue(WebElement e,String name) {
		String attribute = e.getAttribute(name);
		return attribute;
		

	}
		

	}
	
	
	
