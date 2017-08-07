package ctli.it.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ctli.it.qa.constant.Utility;

/**
 * Hello world!
 *
 */
public class BaseClass 
{
	public static WebDriver driver;

	public void openURL()
	{
	    try{	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ab72075\\Desktop\\chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.get(Utility.URL);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    }catch(Exception E)
    {
	        E.printStackTrace();

    }
	}
	public static WebElement waitTillElementVisible(WebElement element){
		WebDriverWait wait=new WebDriverWait(driver,100);
		return wait.until(ExpectedConditions.visibilityOf(element));
		} 

	public static void selectclass(WebElement element)
	{
		Select st=new Select(element);
		st.selectByVisibleText("Q.ADVAN M");
		
	}
	
}
