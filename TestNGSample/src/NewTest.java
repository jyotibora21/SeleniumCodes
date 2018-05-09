
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class NewTest {
	
		public WebDriver drv;
		public  WebElement elesignup;
	  @Test
	  public void main() {
		  WebElement elesignup = drv.findElement(By.linkText("New to Flipkart? Sign up"));
			
			if (elesignup.isDisplayed())
			{
				drv.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("9637464811");
				drv.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("vsb481");
				drv.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
				Boolean val = drv.findElement(By.xpath("//a//img[@title='Flipkart']")).isDisplayed();
				if (val = false)
				{
					System.out.println("Username or Password is Incorrect");
				}
				else
				{
					System.out.println("Login Succesfully to FLipkart");
					drv.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					 WebElement element = drv.findElement(By.xpath("//a[@title='Electronics']"));
					 String eleElectonics = element.getText();
					 System.out.println(eleElectonics);
					 if (eleElectonics.equalsIgnoreCase("Electronics"))
					 {
						 Actions action = new Actions(drv);
						 
					      action.moveToElement(element).build().perform();
					 
					      drv.findElement(By.linkText("Mobiles")).click();
					      drv.findElement(By.xpath("//div[@title= 'Samsung']//div//label//div[@class='_1p7h2j']")).click();
					 }
					 
				        
					
				}
			}
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\boraajyo\\Desktop\\SeleniumJar\\BrowserDrivers\\chromedriver.exe");
			drv = new ChromeDriver(); 
			drv.get("https://www.flipkart.com/");
			drv.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  drv.quit();
	  }
	
}
