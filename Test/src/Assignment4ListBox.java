import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4ListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\boraajyo\\Desktop\\SeleniumJar\\BrowserDrivers\\chromedriver.exe");
		WebDriver drv = new ChromeDriver(); 
		drv.get("http://www.seleniumeasy.com/test/");
		drv.manage().window().maximize();
		drv.findElement(By.linkText("List Box")).click();
		drv.findElement(By.linkText("Data List Filter")).click();
		String expectedname = "Brenda Tree";
		String expectedTitle = "Manager";
		//Search By Name
		drv.findElement(By.id("input-search")).sendKeys(expectedname);
		if (drv.findElement(By.xpath("//h4[text()='Name: "+expectedname+"']")).isDisplayed())
			System.out.println("The Search Name Exists");
		else
				System.out.println("The Search Name doesnot Exists");	
		drv.findElement(By.id("input-search")).clear();
		//div[@class='info-block block-info clearfix']
		//Search By Title and Display the count
		drv.findElement(By.id("input-search")).sendKeys(expectedTitle);
		int size = drv.findElements(By.xpath("//p[text()='Title: "+expectedTitle+"']")).size();
		System.out.println("The total No. of search is: "+size);	
		//List data = drv.findElements(By.xpath("//div[@class='info-block block-info clearfix']")).iterator();
	}

}
