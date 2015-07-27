package com.cucumber.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class commonFuntion{

	//private static commonFuntion instance=null;
	private WebDriver driver = null;
	private WebDriver xyz = null;
	
	public commonFuntion(){}
	
	public WebDriver openBrowser(String browserType){
		if(driver==null){
			if("Mozilla".equalsIgnoreCase(browserType)){
			driver=new FirefoxDriver();
			}else if("IE".equalsIgnoreCase(browserType)){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\elora.parija\\Downloads\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}else if("chrome".equalsIgnoreCase(browserType)){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\elora.parija\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			System.out.println("Driver initialized");
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	/*public static commonFuntion getInstance(){
		if(instance==null){
			instance = new commonFuntion();
		}
		return instance;
	}*/
	

}
