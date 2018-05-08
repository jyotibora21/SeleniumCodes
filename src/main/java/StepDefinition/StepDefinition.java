package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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
	}


}