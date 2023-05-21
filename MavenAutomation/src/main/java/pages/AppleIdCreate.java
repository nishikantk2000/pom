package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleIdCreate extends BasePage {
	WebDriver driver;
	
	//Actions move;
	By shopingBaglink = By.xpath("//a[@id=\"globalnav-menubutton-link-bag\"]");
	By siginlink      = By.xpath("(//a[@class='ac-gn-bagview-nav-link ac-gn-bagview-nav-link-signin'])//span[2]");
    By createIdLink   = By.xpath("//a[@id='create-link']");
   
    
    public AppleIdCreate() {
    	super();
    }
    public void getBagPage() {
    	Actions move = new Actions(driver);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement shopingBagBtn = wait.until(ExpectedConditions.presenceOfElementLocated(shopingBaglink));
		shopingBagBtn.click();
    	//driver.findElement(shopingBaglink).click();
    	System.out.println("Open Bag menu");
    	
    	WebElement link1 = driver.findElement(siginlink);
    	move.click(link1).build().perform();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	WebElement link2 = driver.findElement(createIdLink);
    	move.click(link2).build().perform();
    	
    	
    }
    

}
