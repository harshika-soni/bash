package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneColour {

	public static void main(String[] args) {
		 
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();//maximize browser
		 driver.get("https://www.flipkart.in ");

	}

}
