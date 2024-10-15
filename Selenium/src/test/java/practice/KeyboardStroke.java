package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStroke {

	public static void main(String[] args) {
		

		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com/v1/");
	//	 case 1:		 
	//	 WebElement UserName= driver.findElement(By.name("user-name"));
	//	 UserName.sendKeys("standard_user",Keys.TAB) ; 
		 
//		 driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		 
		// case2:
//		 driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		 
		 WebElement UserName= driver.findElement(By.name("user-name"));
		 UserName.sendKeys("standard_user",Keys.CONTROL+"a");
		UserName .sendKeys(Keys.CONTROL+"c");
		UserName .sendKeys(Keys.TAB,Keys.CONTROL+"v");
		 
		 
		 

	}

}
