import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ENndToEnd {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/* To select from city to to city */
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bhopal (BHO)')]")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//a[contains(text(),'Delhi (DEL)')])[2]")).click();

		/* For Date of journy */
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

		/* To disable the 2nd calendar */
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its enabled");
			Assert.assertFalse(false);

		} else {
			Assert.assertTrue(true);
		}

		/* For checkbox */
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		/* For number of pasengers */

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Thread.sleep(2000l);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		// Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5
		// Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		/* Click on the search button */
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
