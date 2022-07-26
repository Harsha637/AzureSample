package BasicProj.Basicproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class DemoTest {
	
	 WebDriver driver;
	         
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		
	
	     System.setProperty("webdriver.chrome.driver", "./src/test/java/Drivers/chromedriver.exe");
         driver = new ChromeDriver();
            
              driver.get("https://vuse:VsU6Zc0m0x4d05LG@www.vuse-qa.ca/ca/en/");
              driver.manage().window().maximize();
              Thread.sleep(10000);
              driver.findElement(By.xpath("//button[@type='submit']")).click();
              driver.findElement(By.xpath("//*[contains(@class,'Button')]//*[text()='Login/Register']")).click();
              driver.findElement(By.xpath("(.//*[@name='email'])[1]")).sendKeys("Matypots@bat.com");
              driver.findElement(By.xpath("(.//*[@name='password'])[1]")).sendKeys("TEST1234");
              driver.findElement(By.xpath("(.//*[text()='Log in'])[2]")).click();
	}
	@Test
	public void podspage() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[text()='Shop'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Pods'])[1]")).click();
		Thread.sleep(5000);
		String s =driver.findElement(By.xpath("//*[text()='ePod Vape Pods']")).getText();
		Assert.assertEquals("ePod Vape Pods", s);
	}
	
	@Test
	public void AccessoriesPage() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[text()='Shop'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Accessories']")).click();
		Thread.sleep(5000);
		String s =driver.findElement(By.xpath("//*[text()='Charging Cable']")).getText();
		Assert.assertEquals("Charging Cable", s);
	}
	
	@AfterMethod
	public void AfterMethod()
    {
		driver.close();
		
	}
		
	
}
