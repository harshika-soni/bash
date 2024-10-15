package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.dream11.com/ ");
		 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
	String	source=driver.getPageSource();
	System.out.println(source);

	}

}
