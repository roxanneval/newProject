package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			String loginUrl = "https:demo.guru99.com/test/login.html";
			
			driver.get(loginUrl);
			//Get the page Title
			String actualTitle = driver.getTitle();
			
			System.out.println("The Page Title is : = " + actualTitle);
			
			//Validate that it is like we expected it to be
			String expectedTitle = "Login Page";
			
			//Compare the actual title of the page with the expected one and print
			if (actualTitle.contentEquals(expectedTitle)) {
				System.out.println("Correct Title");
			}
			else {
				System.out.println("Incorrect Title");
			}
				
			//Enter Email & Password
			driver.findElement(By.id("email")).sendKeys("roxy26.valentine@gmail.com");
			driver.findElement(By.name("passwd")).sendKeys("12345");
			
			//Click on Sign in Button
			driver.findElement(By.name("SubmitLogin")).submit();
			
			//Verify if the user is successfully logged in my using ClassName
			driver.findElement(By.className("error-copy"));
			
			System.out.println("Login Test Passed");
			

	}

}
