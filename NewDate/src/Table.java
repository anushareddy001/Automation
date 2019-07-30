import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	Actions ac=new Actions(driver);
	driver.findElement(By.xpath("//a[text()='markets']")).click();
//	ac.moveToElement(target).click().perform();
	driver.findElement(By.xpath("//a[text()='Market Stats']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[starts-with(normalize-space(text()),'Daily Share Prices')]")).click();
	Thread.sleep(5000);
WebElement table=driver.findElement(By.xpath("//table[@id='gridSource']"));
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println("no of rows:"+rows.size());
for(WebElement each:rows)
{
	List<WebElement>cols=each.findElements(By.tagName("td"));
	for(WebElement eachcell:cols)
	{
		if(eachcell.getText().isEmpty())
		{
			driver.findElement(By.xpath("//*[@id='gridSource']/tfoot/tr/th[3]")).click();
		}
		System.out.print("\t"+eachcell.getText());
	}
	System.out.println();
}
	}

}
