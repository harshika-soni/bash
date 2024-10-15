package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownusingKeysclass {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	 WebElement DAY = driver.findElement(By.name("birthday_day"));
	 DAY.click();
	 DAY.sendKeys(Keys.ARROW_DOWN);
	 DAY.sendKeys(Keys.ARROW_DOWN);	
	 DAY.sendKeys(Keys.ARROW_DOWN);
	 WebElement MONTH = driver.findElement(By.name("birthday_month"));
	 MONTH.click();
	 MONTH.sendKeys(Keys.ARROW_DOWN);
	 MONTH.sendKeys(Keys.ARROW_DOWN);
	 MONTH.sendKeys(Keys.ARROW_DOWN);
	 WebElement YEAR = driver.findElement(By.name("birthday_year"));
	 YEAR.click();
	 YEAR.sendKeys(Keys.ARROW_UP);
	 YEAR.sendKeys(Keys.ARROW_UP);

	}

}
