import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\OneDrive\\Documents\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
	Set<String>	windows = driver.getWindowHandles();
		
 Iterator<String> it=	windows.iterator();
String parentId = it.next();
 String childId = it.next();
 
 driver.switchTo().window(childId);
 System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
 
 String email = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
 driver.switchTo().window(parentId);
 
 driver.findElement(By.id("username")).sendKeys(email);
	
	}

}
