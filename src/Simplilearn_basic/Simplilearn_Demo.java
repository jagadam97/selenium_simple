package Simplilearn_basic;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.*;

public class Simplilearn_Demo extends basic_setup {
	String Simplilearn = "https://www.simplilearn.com/";
	String er_nw = "Online Selenium Certification | Selenium Training | Selenium Course";
	String er_pw = "Search Simplilearn Online Courses - #1 Certification Bootcamp";
	String ar_nw = null;
	String ar_pw = null;
	public void openweb()
	{
		driver.manage().window().minimize();
		driver.get(Simplilearn);
		driver.manage().window().maximize();
	}
	
	public void search() throws InterruptedException
	{
		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click();
		Thread.sleep(2000);
		try
		{
			
		driver.findElement(By.xpath("//h2[contains(text(),'Selenium 3.0 Training')]")).click();
		
		}
		catch(Exception e)
		{
			System.out.println("failed to load webpage fast enough");
		}
		Thread.sleep(1000);
		String parentWindowHandler = driver.getWindowHandle();
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); 
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		
		driver.switchTo().window(subWindowHandler);

		System.out.println("New window title: " + driver.getTitle());
		ar_nw = driver.getTitle();
		Thread.sleep(300);

		driver.switchTo().window(parentWindowHandler);
		System.out.println("Parent window title : " + driver.getTitle());
		ar_pw = driver.getTitle();
		driver.get("https://google.com");
		System.out.println("Parent window title : " + driver.getTitle());
		driver.quit();
	}

	public void test()
	{
		
	if(er_nw.equalsIgnoreCase(ar_nw))
		{
			System.out.println(ANSI_GREEN + "Validated New Window" + ANSI_RESET);
		}
	else
		{
		System.out.println(ANSI_YELLOW + "Failed validating New Window" + ANSI_RESET);
		}
		
		
		
	if(er_pw.equalsIgnoreCase(ar_pw))
		{
			System.out.println(ANSI_GREEN + "Validated Parent Window" + ANSI_RESET);
		}
	
	else
		{
			System.out.println(ANSI_YELLOW + "Failed validating New Window" + ANSI_RESET);
		}
	
	
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Simplilearn_Demo d = new Simplilearn_Demo();
		d.Firefox();
		d.openweb();
		d.search();
		d.test();
		
		d.Edge();
		d.openweb();
		d.search();
		d.test();
		
		d.Chrome();
		d.openweb();
		d.search();
		d.test();
		
	}

}
