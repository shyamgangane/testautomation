package testAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScriptRegister {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Shyam");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Gangane");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Shyam.gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9673432669");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		
		WebElement skillListElement = driver.findElement(By.id("Skills"));
		Select skillsDropDown = new Select(skillListElement);
		skillsDropDown.selectByVisibleText("Analytics");
		
	}

}
