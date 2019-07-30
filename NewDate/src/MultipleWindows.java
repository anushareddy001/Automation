import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("Parent id is:"+parent);
		Set<String>allwin=driver.getWindowHandles();
		System.out.println("all windows ids::"+allwin);
		Iterator<String>ids=allwin.iterator();
		while(ids.hasNext())
		{
			String dd=ids.next();
			if(!parent.equalsIgnoreCase(dd))
			{
				String title=driver.switchTo().window(dd).getTitle();
				System.out.println(title);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//div[text()='Login']")).click();

	}

}
