import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionE2E
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//No of the link on the whole page
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement colocoloumdriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				
		System.out.println(colocoloumdriver.findElements(By.tagName("a")).size());
				
	}

}
