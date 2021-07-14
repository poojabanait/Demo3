import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\OneDrive\\Documents\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		
		
		//System.out.println(driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]/label[2]")).getText())
		
	String result = driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]/label[2]")).getText();
		
	driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
	
	//String compare= driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).getText();

WebElement compare =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
 
Select s = new Select(compare);
s.selectByVisibleText(result);

 driver.findElement(By.id("name")).sendKeys(result);
 driver.findElement(By.id("alertbtn")).click();
 String message = driver.switchTo().alert().getText();
 if (message.contains(result))
 {
	 System.out.println("success");
	 
 }
	
 else
 {
	 
	 System.out.println("failed");
 }
	
		


	
	
	
	
	}
	
	
	}

		
		



	
		
		
		
		
	


