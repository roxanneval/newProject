package dropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//Create the instance of Chrome Driver
		WebDriver driver = new ChromeDriver();
				
		//Launch URL
		driver.get("https://demoqa.com/select-menu");
		
		//Maximising the window
		driver.manage().window().maximize();
		
		//Select the dropdown element by locating its id
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//Print the option of the dropdown
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
