package tuy.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "/Anand Data/library/geckodriver");   // set path of geckodriver
		
		WebDriver driver = new FirefoxDriver();

		// Launch the Online Store Website
		driver.get("http://teechip.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.google.com");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/div/div[3]/a[2]"));
		login.click();
		// Wailickt for 5 Sec
		Thread.sleep(5000);

		// Close the driver
//		driver.quit();
	}

}
