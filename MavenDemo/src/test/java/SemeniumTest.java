import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SemeniumTest {
	
	@Test
	public void test()
	{
		WebDriver dr=new FirefoxDriver();
		dr.get("http://google.com/");
		System.out.println("Google Launched");
		
	}

}
