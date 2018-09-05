package com.hdfc.loans.carloans;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Browserlaunch  
{
	
	
	public static void main(String[] args)
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.in");
		
	   FirefoxDriver driver1=new FirefoxDriver();
	   driver1.get("https://www.flipkart.com");
	  
	   System.setProperty("webdriver.ie.driver", "C:\\Users\\pavan\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	   InternetExplorerDriver driver2=new InternetExplorerDriver();
	   driver2.get("https://www.ebay.com");
	   
	   

	   
	   
	}
	

}
