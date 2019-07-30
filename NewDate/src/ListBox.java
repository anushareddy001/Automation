import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("searchDropdownBox"));
		Select listbox=new Select(element);
		Boolean b=listbox.isMultiple();
		System.out.println(b);
		listbox.selectByIndex(5);
		System.out.println(listbox.getFirstSelectedOption().getText());
		listbox.selectByVisibleText("Baby");
		System.out.println(listbox.getFirstSelectedOption().getText());
		List<WebElement>list=listbox.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			listbox.getOptions().get(i).click();
		}
		driver.close();
	}

}
