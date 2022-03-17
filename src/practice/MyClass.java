package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and installation of objects and variables  
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//Launch Chrome and Direct it to the Base URL
		driver.get(baseUrl);
		
		//get the actual value of the title
		actualTitle = driver.getTitle();
		
		/*
		 * Compare the actual title of the page with the expected one and print
		 * the actual result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
			}
		
		//close
		driver.close();
		
		//play
		driver.findElement(By.id("firstName"));
		driver.findElement(By.name("gender"));
		driver.findElement(By.className("practice-form-wrapper"));
		driver.findElement(By.partialLinkText("SUP"));
		driver.findElement(By.tagName("a"));
		driver.findElement(By.cssSelector("input[id ='username']"));
	}
	

}
