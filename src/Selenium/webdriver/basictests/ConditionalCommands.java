package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","C:\\Learn selinium\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passbox = driver.findElement(By.xpath("//input[@id='pass']"));
		
		if(emailbox.isDisplayed() && emailbox.isEnabled())
		{
			emailbox.sendKeys("jagadam.dinesh.3");
			
		}
		
		if(passbox.isDisplayed() && passbox.isEnabled())
		{
			passbox.sendKeys("Basha@606");
		}
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		System.out.println("clicked on new account");
		
		driver.navigate().to("https://mbasic.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).click();
		
		WebElement female = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[1]/input[1]"));
		WebElement male = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/label[1]/input[1]"));
		
		
		System.out.println("found male and female elements");
		
		if (female.isSelected()==false)
		{
		Thread.sleep(5000);
		female.click();
		System.out.println("Selected female element");
		}
		
		if (male.isSelected()==false)
		{
		Thread.sleep(5000);
		male.click();
		System.out.println("Selected male element");
		} 
		
		driver.quit();
	}

}
