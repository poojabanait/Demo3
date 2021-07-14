import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\OneDrive\\Documents\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("window.scrollBy(0,700)");
		
	List<WebElement> row =	driver.findElements(By.xpath("//div[@class='left-align']//fieldset//table//tbody//tr"));
		
		System.out.println(row.size());
		
	List<WebElement> col = driver.findElements(By.xpath("//div[@class='left-align']//fieldset//table//tbody//tr//th"));
	
	System.out.println(col.size());
	
	String data =driver.findElement(By.xpath("//div[@class='left-align']//fieldset//table//tbody//tr[3]")).getText();
	System.out.println(data);
	
	}
}
