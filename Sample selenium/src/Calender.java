import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Bhopal (BHO)')]")).click();

		Thread.sleep(2000l);
		// Cause error which one to select from 2 delhi
		// driver.findElement(By.xpath("//a[contains(text(),'Delhi (DEL)')]")).click();

		driver.findElement(By.xpath("(//a[contains(text(),'Delhi (DEL)')])[2]")).click();

		// driver.findElement(By.xpath("[
		// //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']]
		// //a[contains(text(),'Delhi (DEL)')]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

	}

}
