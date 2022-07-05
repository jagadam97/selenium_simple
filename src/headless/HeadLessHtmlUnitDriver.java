package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessHtmlUnitDriver {

	public static void main(String[] args) {


		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println("Title of the page : " + driver.getTitle());
		System.out.println("Current url of the page : " + driver.getCurrentUrl());

	}

}
