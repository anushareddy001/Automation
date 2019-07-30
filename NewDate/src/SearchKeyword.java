import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchKeyword {

	public static void main(String[] args) throws InterruptedException {
		String expcity="bangkok";
		Boolean accity=false;
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Ban");
		Thread.sleep(5000);
		List<WebElement>words=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/div[2]/ul/li/div/div[1]"));
System.out.println(words.size());

	}

}
