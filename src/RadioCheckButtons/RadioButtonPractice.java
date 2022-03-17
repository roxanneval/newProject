package RadioCheckButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class RadioButtonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//Create the instance of Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https:demo.guru99.com/test/radio.html");
		
		//Get the Element locators for the radio buttons
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		//Select the radio button 1
		radio1.click();
		System.out.println("Radio Button 1 Selected");
		
		//Select the radio button 2
		radio2.click();
		System.out.println("Radio Button 2 Selected");
				
		//Toggle
		//radio1.click();
		//System.out.println("Radio Button 1 Selected");
				
		//Located the option 1 check box
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));		
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));	
		
		//Check the option 1
		option1.click();
		option2.click();
		
		
		//Check whether the check box is toggle on
		if (option1.isSelected()) {
			System.out.println("Check Box is toggled on");
		}
		else {
			System.out.println("Check Box is toggled off");
		}
				
		//Check whether the check box is toggle on
	}
	
	
	

}
