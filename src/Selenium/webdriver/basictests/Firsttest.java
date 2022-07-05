package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firsttest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Learn selinium\\Drivers\\geckodriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver();// Invokes only firefox browser
		
		WebDriver driver = new FirefoxDriver();//invokes browser but driver assingment can be changed to any browser
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Thread.sleep(200);
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(300);
		driver.findElement(By.name("submit")).click();
		
		String exptitle = "Login: Mercury Tours";
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		//validation
		if(exptitle.equals(acttitle))
		{
			System.out.println("test is passes");
		}
		else
		{
			System.out.println("test is failed");
		}
		
		driver.close();

	}

}
