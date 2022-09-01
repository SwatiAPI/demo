package day1.basicOps;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * path: 
		 * 1.Absolute path --> E:\\workspacenew\\Seleniumbasic\\Executable\\chromedriver.exe
		 * 2. Relative path -->.\\Executable\\chromedriver.exe
		 * * Step2: create an instance of required browser class
		 */
		String currentWorkingDir = System.getProperty("user.dir"); /* E:\\workspacenew\\Seleniumbasic\\ */
		System.out.println(" Current Working dir:  " + currentWorkingDir);
		
		String chromeExePath= currentWorkingDir + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		ChromeDriver ref=new ChromeDriver();
		//to enter the url on the open browser
		ref.get("https://www.google.com");
		//close the current browser
		ref.close();
	
		
		
		
		
	}

}
