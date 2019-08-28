import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	@Test
	public void testOne() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.out.println(" configure");
		System.out.println(" configure");
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
