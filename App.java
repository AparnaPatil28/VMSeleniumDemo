package com.mycompany.app.addressbook_selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class App
{
@Test

public static void main(String[] args) {
	
	//System.setProperty("webdriver.gecko.driver","geckodriver"); // Setting system properties of FirefoxDriver
	//FirefoxOptions firefoxOptions = new FirefoxOptions();
	//WebDriver driver = new FirefoxDriver(firefoxOptions); //Creating an object of FirefoxDriver	 
	
	//firefoxOptions.addArguments("--headless");
	//firefoxOptions.setHeadless(false);
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\japat\\Desktop\\Aparna\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","/home/ubuntu/selenium/chromedriver");
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = new ChromeDriver(chromeOptions);
		 
	chromeOptions.addArguments("--headless");
	System.out.println("Hi, Welcome to Demo on Selenium WebDriver");


	 driver.get("http://192.168.56.101:8888/addressbook");
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 driver.findElement(By.className("v-button")).click();
	 driver.findElement(By.id("gwt-uid-5")).sendKeys("Aparna");
	 driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
	 driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
	 driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
	 driver.findElement(By.className("v-button-primary")).click();
	 //Thread.sleep(5000);
	 //driver.quit();
	}
}
