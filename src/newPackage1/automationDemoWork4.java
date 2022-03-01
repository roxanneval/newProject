package newPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationDemoWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		//Launch URL without creating variable
				driver.get("https://demoqa.com/select-menu");
				
		//Maximising the window
		driver.manage().window().maximize();
				
		//Select the dropdown element by locating its id by using the Select tag
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
				
		//Print the option of the dropdown using .getOption Operator
		//List method is used to fetch all the elements lies within the given range.
		List<WebElement>lst=select.getOptions();
				
		//Looping through the options and printing dropdown options
		System.out.println("The dropdown options are: ");
		for(WebElement option:lst)
		System.out.println(option.getText());
				
		//Select the option as Purple by Index
		select.selectByIndex(4);
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	}

}
