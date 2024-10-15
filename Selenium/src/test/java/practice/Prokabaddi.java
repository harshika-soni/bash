package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prokabaddi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.prokabaddi.com/standings");
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any team name");
	           String name = sc.next();
	           String TName=driver.findElement(By.xpath("//div[@class='team-name']")).getText();
	
	
	  // String playing = driver.findElement(By.xpath("//p[@class='name']/../../../..//div[@class='table-data matches-play']//p[@class='count']")).getText();
	  // System.out.println(playing);
	      String Won=driver.findElement(By.xpath("//div[@class='team-name']/../../../..//div[@class='table-data matches-won']")).getText();
			   System.out.println(Won);
			//	String won= driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../../div[4]//p[@class='count']")).getText();
 // System.out.println(won);
	}

}
