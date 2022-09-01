package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxWithGenericWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * path: 
		 * 1.Absolute path --> "E:\\workspacenew\\Seleniumbasic\\Executable\\geckodriver.exe");
		 * 2. Relative path -->.\\Executable\\geckodriver.exe
		 * * Step2: create an instance of required browser class
		 */
		
		String currentWorkingDir = System.getProperty("user.dir");/*E:\\workspacenew\\Seleniumbasic*/
		String FirefoxExePath= currentWorkingDir + "\\Executable\\\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", FirefoxExePath);
		
		// geckodriverDriver ref=new geckoDriver(); // or 
		// create an instance of Firefox browser and Upcasting it to WebDriver Interface
				
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
}