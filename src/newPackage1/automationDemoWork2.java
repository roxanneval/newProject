//Test Case 1

package newPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationDemoWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration and installation of objects and variables  
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Declare Variable
		String guruURL = "https://demo.guru99.com/test/newtours/";
		


		//Launch Chrome and Direct it to the Base URL
		driver.get(guruURL);

		driver.findElement(By.name("userName")).sendKeys("Roxanne");
		driver.findElement(By.cssSelector("input[name ='password']")).sendKeys("123456");
	}

}
