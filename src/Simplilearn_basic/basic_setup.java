package Simplilearn_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class basic_setup
{
	WebDriver driver;
	//Drivers set Property and Switching Drivers
	public void Firefox()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Learn selinium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println(ANSI_CYAN + "Driver is set to Gecko Driver(Working in Firefox)" + ANSI_RESET );
	}
	public void Edge()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Learn selinium\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println(ANSI_CYAN + "Driver is set to MSEdge Driver(Working in Edge)" + ANSI_RESET );
	}
	public void Chrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Learn selinium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(ANSI_CYAN + "Driver is set to Chrome Driver(Working in Chrome)" + ANSI_RESET );
	}
	// colors for prints
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
}
