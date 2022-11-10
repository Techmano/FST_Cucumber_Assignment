package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksclass {
	
	public static WebDriver driver;
	
	@Before
	public void init()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    System.out.println("===== Browser Started =====");
	    driver.manage().window().maximize();
	}
	
	/*@After
	public void quit()
	{
		driver.quit();
		System.out.println("closing driver");
	}*/

}
