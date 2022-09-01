package day1.basicOps;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

				/**
				 * Step1: set the path of required browser executable file using System.setProperty(key, value)
				 * path: 
				 * 1.Absolute path -->E:\workspacenew\Seleniumbasic\Executable\IEDriverServer.exe
				 * 2. Relative path -->.\\Executable\IEDriverServer.exe
				 * * Step2: create an instance of required browser class
				 */
				String currentWorkingDir = System.getProperty("user.dir"); /*E:\workspacenew\Seleniumbasic\\ */
				System.out.println(" Current Working dir:  " + currentWorkingDir);
				
				String ieExePath= currentWorkingDir + "\\Executable\\IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", ieExePath);
				
				InternetExplorerDriver ref=new InternetExplorerDriver();
				//to enter the url on the open browser
				ref.get("https://www.google.com");
				//close the current browser
				ref.close();
			
			}

		

	}


