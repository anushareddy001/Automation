import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
@BeforeMethod
public void login()
{
	Reporter.log("Running Before Method",true);
}
@Test(priority=0)
public void compose()
{
	Reporter.log("Compose sucessful",true);
}
@Test(priority=1,dependsOnMethods="compose")
public void Reply()
{
	Reporter.log("Reply sucessful",true);
}
@AfterMethod
public void logout()
{
	Reporter.log("logout sucessful",true);
}
}
