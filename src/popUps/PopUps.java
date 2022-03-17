package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();
		//setting up explicit waits
		WebDriverWait wait = new WebDriverWait(driver, 20);

		String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
		driver.get(baseUrl);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("cusid")).sendKeys("3231564");
		
		//Switch to the alert
		Alert alert= driver.switchTo().alert();
		
		//Capturing the alert message
		String alertMessage = driver.switchTo().alert().getText();
		
		//Display message on console
		System.out.println(alertMessage);
		//Thread.sleep(5000);
		
		//Accept Alert
		alert.accept();
		//alert.dismiss();
		
		driver.findElement(By.name("cusid")).sendKeys("3231564");
		driver.findElement(By.name("submit")).submit();
		
	}

}
