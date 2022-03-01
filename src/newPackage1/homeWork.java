package newPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String guruURL = "https://demo.guru99.com/test/newtours/";
//		String guruFlights = "https://demo.guru99.com/test/newtours/reservation.php";
		
		//Launch Guru Site
		driver.get(guruURL);
		
		//Find and Select Flights
		driver.findElement(By.linkText("Flights")).click();
		
//		//Avoid pop up for now
//		driver.get(guruFlights);
		
		//Select oneway
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		
		//Select the dropdown element by locating its id
		Select select = new Select(driver.findElement(By.name("fromPort")));
		
		//Select the option as Purple by Index
		select.selectByIndex(3);
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		
		
		//Select Service Class
		driver.findElement(By.cssSelector("input[value='Business']")).click();
	
		//Select Continue
		driver.findElement(By.cssSelector("input[name='findFlights']")).click();
		
	
	}
	

}
