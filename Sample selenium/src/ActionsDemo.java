import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// to move mouse pointer
		Actions a= new Actions(driver);
		
		// To move a specific element
       //a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform(); 
       //                          OR
       WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); 
       a.moveToElement(move).build().perform(); 
       
       // To click on the search and type in capital letters
       a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello all").perform(); 
       
       // To select i.e. double click to select the entire text
       a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("  hello all").doubleClick().perform(); 
       
       //To right click
       a.moveToElement(move).contextClick().perform();

       
       
       
       
	}

}
