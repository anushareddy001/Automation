import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinks {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://naukri.com/");
	driver.manage().window().maximize();
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++)
	{
		String linkname=links.get(i).getText();
		String url=links.get(i).getAttribute("href");
		List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println(linkname+"   "+url);
		links.get(i).click();
//		driver.navigate().back();
	}
	}

}
