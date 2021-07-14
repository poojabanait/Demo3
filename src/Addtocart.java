import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\OneDrive\\Documents\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Tomato"};
		//Thread.sleep(2000);
	
		
		
		List<WebElement> products=	driver.findElements(By.cssSelector("h4.product-name"));
	
	for (int i=0; i<products.size(); i++)
	
	{
	String[] name =products.get(i).getText().split("-");
	String formattedName = name[0].trim();
	Thread.sleep(2000);
	List itemNeededList = Arrays.asList(itemsNeeded);
	int j=0;
	if (itemNeededList.contains(formattedName))
	{
		j++;
		driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).click();
		
		if (j==3)
		{
			break;
		}
	}
	
	}

	driver.findElement(By.xpath("//img[@alt ='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());  
	


	
	}
}
