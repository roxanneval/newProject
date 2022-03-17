//Test Case 2

package automationDemoWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration and installation of objects and variables  
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		
		//Create Variable URL
		String guruFlights = "https://demo.guru99.com/test/newtours/reservation.php";
		
		//Launch URL
		driver.get(guruFlights);
		
		//Select oneway
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
				
		//Select the dropdown element by locating its id
		Select select = new Select(driver.findElement(By.name("fromPort")));
		
		//Select Service Class
		driver.findElement(By.cssSelector("input[value='Business']")).click();
			
		//Select Continue (Search for Flights)
		//driver.findElement(By.cssSelector("input[name='findFlights']")).click();
		
	}

}
