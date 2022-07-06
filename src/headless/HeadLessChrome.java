package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadLessChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Learn selinium\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println("Title of the page : " + driver.getTitle());
		System.out.println("Title of the page : " + driver.getCurrentUrl());
		driver.quit();
	}

}
