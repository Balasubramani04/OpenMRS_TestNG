package com.seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button'][text()='Create new account']")).click();
		WebElement id = driver.findElement(By.name("firstname"));
		id.sendKeys("Balasubramani");	
		WebElement pass = driver.findElement(By.name("lastname"));
		pass.sendKeys("M");	
		WebElement option = driver.findElement(By.id("month"));
		
	}
}
