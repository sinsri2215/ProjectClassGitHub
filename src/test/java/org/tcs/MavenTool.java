package org.tcs;

import org.libGlobal.libGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTool {
	
	public static void main(String[] args) {
		
		
		libGlobal global = new libGlobal();
		
		WebDriver driver = global.launchBrowser();
		
		//maximize the window
		global.maximizewindow();
		//URl
		global.loadurl("https://www.facebook.com/");
		
		//userName
		WebElement txtUserName = driver.findElement(By.id("email"));
		global.typetext(txtUserName, "sriram15");
		
		//password
		WebElement txtPassword = driver.findElement(By.name("pass"));
		global.typetext(txtPassword, "150397");
		
		String value = global.getAttributeValue(txtUserName, "value");
		System.out.println(value);
		
		//click login
		WebElement btnLogin = driver.findElement(By.id("u_0_5_K+"));
		global.btnLogin(btnLogin);
		
		//to quit the browser
		global.quitBrowser();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
