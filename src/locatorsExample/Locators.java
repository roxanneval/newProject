package locatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demoqa.com/";
		String practiceUrl = "https://demoqa.com/automation-practice-form";
		String guruUrl = "https://demo.guru99.com/test/newtours/";
		//driver.get(baseUrl);
		
		//Locate by ID Attribute
		driver.get(practiceUrl);
		driver.findElement(By.id("firstName")).sendKeys("Roxanne");
		driver.findElement(By.id("lastName")).sendKeys("Valentine");
		driver.findElement(By.id("submit")).sendKeys("Valentine");
		
//		driver.get(guruUrl);
//		driver.findElement(By.name("userName")).sendKeys("Roxanne");
//		driver.findElement(By.name("password")).sendKeys("12345");
//		driver.findElement(By.name("submit")).submit();
		
//		//Locate by Class
//		driver.findElement(By.className("btn btn-primary")).click();
	
//	
//		//Locate by cssSelector attribute
//		driver.findElement(By.cssSelector("input[id='firstName']"));
//		
//		//Locate by xpath attribute
//		driver.findElement(By.xpath("//[input[@id= 'userEmail']"));
//		
//		//Locate by Linkedtext and particallinktext attribute
//		driver.get(guruUrl);
//		driver.findElement(By.linkText("SIGN-ON"));
//		driver.findElement(By.partialLinkText("REG"));
//		
//		//Locate using name
//		driver.findElement(By.name("userName"));
//	
//		driver.close();
	}

}
