import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumprac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\OneDrive\\Documents\\eclipse\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	
	
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
	Select s = new Select(staticDropdown);
	s.selectByIndex(3);

	
	driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
int i=1;
while(i<5)
{
driver.findElement(By.id("hrefIncAdt")).click();
i++;
}	

driver.findElement(By.id("btnclosepaxoption")).click();


Thread.sleep(4000);


	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@value='JAI']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	
	
	
	
	
	
	}

}
