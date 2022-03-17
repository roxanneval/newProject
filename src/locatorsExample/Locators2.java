package locatorsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

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
		driver.findElement(By.id("lastName"));
		
		//Locate by Class
		driver.findElement(By.className("left-pannel"));
		
		//Locate by cssSelector attribute
		driver.findElement(By.cssSelector("input[id='firstName']"));
		
		//Locate by xpath attribute
		driver.findElement(By.xpath("//[input[@id= 'userEmail']"));
		
		//Locate by Linkedtext and particallinktext attribute
		driver.get(guruUrl);
		driver.findElement(By.linkText("SIGN-ON"));
		driver.findElement(By.partialLinkText("REG"));
		
		//Locate using name
		driver.findElement(By.name("userName"));
	
		driver.close();
	}

}
	}

}
