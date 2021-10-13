import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");

		//System.out.println(driver.getTitle());

		//System.out.println(driver.getCurrentUrl());

		//System.out.println(driver.getPageSource());
		
		/*driver.get("https://facebook.com");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hi mohit");
	    /*-driver.findElement(By.id("email")).sendKeys("HI Mohit");
		driver.findElement(By.id("pass")).sendKeys("123456");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("HI Mohit");
		driver.findElement(By.xpath("//*[@id='u_0_d_2B']")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("HI monit");
		
		//driver.findElement(By.c.xpath("/#u_0_a_ot > div._6ltj > a")).click();
		//driver.findElement(By.cssSelector("\r\n"	+ "#u_0_a_ot > div._6ltj > a")).click();
		
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		//driver.quit();*/
		driver.get("https://google.com");

driver.findElement(By.xpath("//div[@class='SDkEP']/div/div[2]/div/input"))
		.sendKeys("Ram");}}