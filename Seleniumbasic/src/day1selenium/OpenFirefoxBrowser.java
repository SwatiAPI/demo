package day1selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"E:\\workspacenew\\Seleniumbasic\\Executable\\geckodriver.exe");
		FirefoxDriver ref = new FirefoxDriver();
		ref.get("https://www.google.com");
		ref.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	

