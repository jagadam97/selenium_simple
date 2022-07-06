package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Learn selinium\\Drivers\\geckodriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver();// Invokes only firefox browser
		
		WebDriver driver = new FirefoxDriver();//invokes browser but driver assingment can be changed to any browser
		driver.manage().window().maximize();
		
		//Get Methods
		
		driver.get("https://demo.guru99.com/test/newtours/");//opens the URL
		
		System.out.println(driver.getTitle());//Returns the page title
		
		System.out.println(driver.getCurrentUrl());//Returns the page URL
		
		String text = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/font[1]/b[1]")).getText();			
		
		System.out.println(text);//Returns the page title
		
		driver.close(); //close current window
		
		driver.quit(); //Closes multiple windows
		
		

	}

}
