package Action2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Stuff\\Chrome Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		System.out.println("Maven Practice");
		
		//Entering Hello in text box and then selecting it
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Moves to specific element
		//a.moveToElement(move).build().perform();
		
	//To right click
	//a.moveToElement(move).contextClick().build().perform();

	}

}
