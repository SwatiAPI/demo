package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEWithGenericWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * path: 
		 * 1.Absolute path -->E:\workspacenew\Seleniumbasic\Executable\IEDriverServer.exe
		 * 2. Relative path -->.\\Executable\IEDriverServer.exe
		 * * Step2: create an instance of required browser class
		 */
		String currentWorkingDir = System.getProperty("user.dir"); /*E:\workspacenew\Seleniumbasic\\ */
		String ieExePath= currentWorkingDir + "\\Executable\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", ieExePath);
		
		// IEDriver ref=new IEDriver(); // or 
		// create an instance of InternetExplorer browser and Upcasting it to WebDriver Interface
		
		
		WebDriver driver =new InternetExplorerDriver();
		//to enter the url on the open browser
		driver.get("https://www.google.com");
		//close the current browser
		driver.close();
	
	}



}


