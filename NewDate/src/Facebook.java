import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Facebook {
	WebDriver driver;
	Properties p;
	FileInputStream fi;
	@BeforeMethod
	public void launch() throws IOException
	{
		p=new Properties();
	fi=new FileInputStream("D:\\Selenium_Framework\\NewDate\\Prop.properties");
		p.load(fi);
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}
	@Test()
	public void create()
	{
	driver.findElement(By.xpath(p.getProperty("first"))).sendKeys("Priya");
	driver.findElement(By.xpath(p.getProperty("last"))).sendKeys("Lucky");
	driver.findElement(By.xpath(p.getProperty("mobile"))).sendKeys("8985874312");
	driver.findElement(By.xpath(p.getProperty("pass"))).sendKeys("anusha");
	WebElement ele=driver.findElement(By.xpath(p.getProperty("day")));
	Select s=new Select(ele);
	s.selectByIndex(20);
	WebElement ele1=driver.findElement(By.xpath(p.getProperty("month")));
	Select s1=new Select(ele1);
	s1.selectByVisibleText("Jul");
	WebElement ele2=driver.findElement(By.xpath(p.getProperty("year")));
	Select s2=new Select(ele2);
	s2.selectByValue("1996");
	driver.findElement(By.xpath(p.getProperty("gender"))).click();
	driver.findElement(By.xpath(p.getProperty("signup"))).submit();
	}
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
}
