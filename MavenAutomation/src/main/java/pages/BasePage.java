package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage{
	 public static WebDriver driver;
	 public static void init()
	  {
	      
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            driver.get("https://www.apple.com/in/app-store");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	            
	    }
	
}

	  
	 