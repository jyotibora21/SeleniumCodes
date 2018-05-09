import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\boraajyo\\Desktop\\SeleniumJar\\BrowserDrivers\\chromedriver.exe");
		WebDriver drv = new ChromeDriver(); 
		drv.get("http://www.seleniumeasy.com/test/");
		drv.manage().window().maximize();
		drv.findElement(By.linkText("Input Forms")).click();;
		drv.findElement(By.linkText("Simple Form Demo")).click();;
		String  strmessage = "Selenium";
		drv.findElement(By.id("user-message")).sendKeys(strmessage);
		drv.findElement(By.xpath("//button[text()='Show Message']")).click();
		String ActualMessage = drv.findElement(By.xpath("//div[@id='user-message']")).getText();
		String ExpectedMessage = "Your Message: "+strmessage;
		if (ActualMessage.equals(ExpectedMessage))
			System.out.println("Matched Succesfully");
		else
			System.out.println("Not Matched Succesfully");
		String sum1 = "10";
		String sum2 = "20";
		int ExpectedTotal = Integer.parseInt(sum1)+Integer.parseInt(sum2);
		drv.findElement(By.id("sum1")).sendKeys(sum1);
		drv.findElement(By.id("sum2")).sendKeys(sum2);
		drv.findElement(By.xpath("//button[text()='Get Total']")).click();
		int Actualtotal = Integer.parseInt(drv.findElement(By.id("displayvalue")).getText());
		if( Actualtotal== ExpectedTotal)
			System.out.println("Message Displayed Correct");
		else
			System.out.println("Message not Displayed Correct");	
	}

}
