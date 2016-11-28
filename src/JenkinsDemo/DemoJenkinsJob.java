package JenkinsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoJenkinsJob 
{
	@Test
	public void testJenkins()
	{
	  System.out.println("Welcome to Jenkins");	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Paramjeet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pepperfry.com");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.quit();
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
