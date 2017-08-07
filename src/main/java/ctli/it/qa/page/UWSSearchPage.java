package ctli.it.qa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ctli.it.qa.base.BaseClass;

public class UWSSearchPage extends BaseClass {
	
	
	
public void uwsCustomerSearch(String customerNameSearch) throws InterruptedException{
   	
	    Thread.sleep(40000);
		driver.findElement(By.xpath("//input[@name='searchValue']")).sendKeys(customerNameSearch);
		
	}
	
	public  void uwsSearchSubmit() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@ng-click='goToResult()']")).click();
		
	}  	  

}