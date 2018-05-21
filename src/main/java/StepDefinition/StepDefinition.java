package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ExcelDatatoDataTable.ExcelDatatoTable;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.Transform;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	
	
	
	WebDriver drv;
	private Scenario scenario;
	
	@Before
	public void LaunchBrowser(Scenario scenario)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\boraajyo\\Desktop\\SeleniumJar\\BrowserDrivers\\chromedriver.exe");
		drv = new ChromeDriver();
		this.scenario= scenario;
		System.out.println("Execution Scenario: "+scenario.getName());
	}
	@After("@selenium")
	public void TakeScreenshot()
	{
		 scenario.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
	}
	
	@Given("^Enter Username and Password$")
	public void enter_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
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
	   scenario.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
	   Thread.sleep(6000);
	   //String str = drv.findElement(By.xpath("//td[@class='logo_text']")).getTagName();
	   
	  //Assert.assertEquals(str, "CRMPRO");
	  
	}
//	@Then("^Take Login Screenshot$")
//	public void take_Login_Screenshot(Scenario ss) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   ss.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
//	}

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
		Thread.sleep(4000);
		scenario.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
		
	}
	

	@Given("^Create a Document Enter <\"([^\"]*)\"> and<\"([^\"]*)\">$")
	public void create_a_Document_Enter_and(String Title_name, String Description_name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//a[@title='Calendar']
		drv.findElement(By.xpath("//a[@title='Calendar']")).click();
		drv.findElement(By.xpath("//a[@title='New Event']")).click();
		Thread.sleep(4000);
	    drv.findElement(By.id("title")).sendKeys(Title_name);
	    drv.findElement(By.xpath("//input[@value='==ADD==>']")).click();
	    drv.findElement(By.id("notes")).sendKeys(Description_name);
	    Thread.sleep(5000);
	    drv.findElement(By.xpath("//form[@id='appForm']//input[@value='Save']")).click();
	    scenario.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
	  
	}
	@Given("^Create a Product$")
	public void create_a_Product(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		for(Map<String, String> s : arg1.asMaps(String.class, String.class)){
		
		
			drv.findElement(By.xpath("//a[@title='Deals']")).click();
			drv.findElement(By.xpath("//div[@id='navmenu']//li//a[@title='Products']")).click();
			Thread.sleep(4000);
			int NoofProducts= drv.findElements(By.xpath("//i[@title='Delete']")).size();
			System.out.println("Number of Products available: "+NoofProducts);
			if (NoofProducts >=5)
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
			drv.findElement(By.xpath("//input[@id='name']")).sendKeys(s.get("Name"));
			drv.findElement(By.xpath("//input[@id='cost']")).clear();
			drv.findElement(By.xpath("//input[@id='cost']")).sendKeys("10");
			drv.findElement(By.xpath("//input[@id='retail_value']")).clear();
			//drv.findElement(By.xpath("//input[@id='retail_value']")).clear();
			drv.findElement(By.xpath("//input[@id='retail_value']")).sendKeys("20");
			drv.findElement(By.xpath("//input[@id='wholesale']")).clear();
			drv.findElement(By.xpath("//input[@id='wholesale']")).sendKeys("30");
			drv.findElement(By.xpath("//input[@id='sku']")).sendKeys(s.get("Inventory Amount"));
			drv.findElement(By.xpath("//input[@id='inventory_amount']")).clear();
			drv.findElement(By.xpath("//input[@id='inventory_amount']")).sendKeys("10");
		
			drv.findElement(By.xpath("//form[@id='productForm']//input[@value='Save']")).submit();
			Thread.sleep(4000);
			scenario.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
			
		}
	    
	}
	@Given("^Create a Task$")
	public void create_a_Task() throws Throwable {
	   
	}

	@When("^Task are Fetched from Excel \"([^\"]*)\"$")
	public void task_are_Fetched_from_Excel(@Transform(ExcelDatatoTable.class) DataTable table) throws Throwable {
		
		System.out.println(table.toString());
		
		List<String> dataList = table.asList(String.class);
		
		for(String str : dataList){
			System.out.println(str);
		}
	}


	@Given("^Create Alert$")
	public void create_Alert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		drv.findElement(By.xpath("//a[@title='Alerts']")).click();
		Thread.sleep(4000);
		Select selectbyvalue = new Select(drv.findElement(By.xpath("//select[@name='alert_send_mode']")));
		selectbyvalue.selectByValue("N");
		Select selectbyvalue2 = new Select(drv.findElement(By.xpath("//select[@name='object_type']")));
		selectbyvalue2.selectByValue("PROSPECT");
		List liradiobutton = drv.findElements(By.xpath("//input[@name='active']"));
		boolean b = false;
		boolean ovalue = ((WebElement) liradiobutton.get(0)).isSelected();
		if (ovalue = true)
		{
			((WebElement) liradiobutton.get(1)).click();
		}
		else
		{
			((WebElement) liradiobutton.get(0)).click();
		}
		Thread.sleep(5000);
		drv.findElement(By.xpath("//form[@method='post']//input[@value='Save']")).click();
		scenario.embed(((TakesScreenshot)drv).getScreenshotAs(OutputType.BYTES), "image/png");
		//Validate the table
		 //int size= drv.findElements(By.xpath("//table[@class='datacard']")).size();
		// System.out.println("Size of Table "+size);
		 
	}
}

	

