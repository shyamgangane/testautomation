package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("shyam.gangane@gmail.com");
		
		driver.findElement(By.id("enterimg")).click();
		
		String titleAter = driver.getTitle();
		
		if(titleAter.equalsIgnoreCase("Register")) {
			System.out.println("Test Case is Passed");
		}
		else {
			System.out.println("Test Case is Failed");
			
		}
		
		
		
		
		
	}

}
