package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepDefinition {
	WebDriver drv;
	@Given("^Enter Username and Password$")
	public void enter_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\boraajyo\\Desktop\\SeleniumJar\\BrowserDrivers\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("https://www.crmpro.com/");
		drv.manage().window().maximize();
		Thread.sleep(4000);
	}

	@Then("^Login Successfully$")
	public void login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   drv.findElement(By.name("username")).sendKeys("jyoti_bora21");
	   drv.findElement(By.name("password")).sendKeys("Vinod@1989");
	   drv.findElement(By.xpath("//input[@value='Login']")).click();
	   Thread.sleep(6000);
	   //String str = drv.findElement(By.xpath("//td[@class='logo_text']")).getTagName();
	   
	  //Assert.assertEquals(str, "CRMPRO");
	  
	}
	@Given("^Create a Deal$")
	public void CreateDeal() throws Throwable
	{
		drv.switchTo().frame("mainpanel");
		

		drv.findElement(By.xpath("//a[@title='Deals']")).click();
		drv.findElement(By.xpath("//a[@title='New Deal']")).click();
		//drv.switchTo().defaultContent();
		//drv.switchTo().frame("mainpanel");
		Thread.sleep(5000);
		drv.findElement(By.xpath("//input[@id='title']")).sendKeys("NewDeal");
		drv.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("Tieto");
		drv.findElement(By.name("contact_lookup")).sendKeys("9637464811");
		drv.findElement(By.name("amount")).sendKeys("200");
		drv.findElement(By.name("probability")).sendKeys("10");
		drv.findElement(By.name("commission")).sendKeys("10");
		drv.findElement(By.name("quantity")).sendKeys("10");
		Select selectbyvisibletext1 = new Select(drv.findElement(By.xpath("//select[@name='type'][@size=1]")));
		selectbyvisibletext1.selectByVisibleText("New");
		Select selectbyvisibletext2 = new Select(drv.findElement(By.xpath("//select[@name='source'][@size=1]")));
		selectbyvisibletext2.selectByVisibleText("Online");
		drv.findElement(By.xpath("//td//img[@id='f_trigger_c_close_date']")).click();;
		drv.findElement(By.xpath("//td[@class='day selected today']")).click();
		
		drv.findElement(By.xpath("//td//img[@id='f_trigger_c_actual_close_date']")).click();
		drv.findElement(By.xpath("//td[@class='day selected today']")).click();
		drv.findElement(By.xpath("//form[@id='prospectForm']//input[@class='button'][@value='Save']")).click();	
		
	}
	
	@Given("^Create a Product$")
	public void CreateaProduct() throws InterruptedException
	{
		int NoofProducs = 0;
		
		
		for(int i=0;i<8;i++)
		{
			drv.findElement(By.xpath("//a[@title='Deals']")).click();
			drv.findElement(By.xpath("//div[@id='navmenu']//li//a[@title='Products']")).click();
			Thread.sleep(4000);
			NoofProducs= drv.findElements(By.xpath("//i[@title='Delete']")).size();
			System.out.println("Number of Products available: "+NoofProducs);
			if (NoofProducs >=5)
			{
				 List <WebElement> li = drv.findElements(By.xpath("//i[@title='Delete']"));
				 for(int j =0 ;j<li.size();j++)
				 {
					li.get(j).click();
					Thread.sleep(5000);
					drv.switchTo().alert().accept();
					
				 }
				 
			}
			drv.findElement(By.xpath("//input[@value='New Product']")).click();
			Thread.sleep(4000);
			drv.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
			drv.findElement(By.xpath("//input[@id='cost']")).clear();
			drv.findElement(By.xpath("//input[@id='cost']")).sendKeys("10");
			drv.findElement(By.xpath("//input[@id='retail_value']")).clear();
			drv.findElement(By.xpath("//input[@id='retail_value']")).clear();
			drv.findElement(By.xpath("//input[@id='retail_value']")).sendKeys("10");
			drv.findElement(By.xpath("//input[@id='wholesale']")).clear();
			drv.findElement(By.xpath("//input[@id='wholesale']")).sendKeys("15");
			drv.findElement(By.xpath("//input[@id='sku']")).sendKeys("qwe");
			drv.findElement(By.xpath("//input[@id='inventory_amount']")).clear();
			drv.findElement(By.xpath("//input[@id='inventory_amount']")).sendKeys("20");
			Thread.sleep(4000);
			drv.findElement(By.xpath("//form[@id='productForm']//input[@value='Save']")).click();
		}
	}

}
