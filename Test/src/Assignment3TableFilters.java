import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3TableFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\boraajyo\\Desktop\\SeleniumJar\\BrowserDrivers\\chromedriver.exe");
		WebDriver drv = new ChromeDriver(); 
		drv.get("http://www.seleniumeasy.com/test/");
		drv.manage().window().maximize();
		drv.findElement(By.linkText("Table")).click();
		drv.findElement(By.linkText("Table Data Search")).click();
		
	}

}
