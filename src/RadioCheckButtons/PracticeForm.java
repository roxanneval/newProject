package RadioCheckButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				
		//Create the instance of Chrome Driver
		WebDriver driver = new ChromeDriver();
				
		//Launch URL
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Validate isSelected and Click
		WebElement checkBoxSelected = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1'][class='custom-control-label']"));
		//WebElement checkBoxSelected = driver.findElement(By.cssSelector("input[id=\'hobbies-checkbox-1']"));
		boolean isSelected = checkBoxSelected.isSelected();
	
		
		//Perform the Click operation if the element is not selected
		if(isSelected == false) { 
			checkBoxSelected.click();
		}
		
		//Validate isDisplayed and click
		WebElement checkBoxDisplay = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
		boolean isDisplay = checkBoxDisplay.isDisplayed();
		
		//perform the click operation if the element is not selected
		if (isDisplay == true) {
			checkBoxDisplay.click();
		}
	}

}
