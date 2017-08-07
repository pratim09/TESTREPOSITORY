package ctli.it.qa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ctli.it.qa.base.BaseClass;

public class OrderQuotingPage extends BaseClass{
	
public void Customer_Overview_Page() throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@ng-click='onAdd()']")).click();
	
	
}
 public void addaccount() throws InterruptedException
 {   
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[.='Accounts']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@ng-click='onAdd()']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='Search']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//td[.='66910212']/..//input[@type='checkbox']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[.='Close']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//td[.='66910212']/..//input[@type='radio']")).click();	
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@ng-click='onGetProduct()']")).click();
	 Thread.sleep(1000);
	 selectclass(driver.findElement(By.id("selectedBrand")));
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@ng-click='searchProducts()']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//td[.='124367698']/..//input[@type='checkbox'] ")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[.='Close']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[.='Accounts']")).click();
			
 }
 
 public void contracts() throws InterruptedException
 {
	 Thread.sleep(3000);
     driver.findElement(By.xpath("//span[.='Contracts']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@ng-click='addContract()']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.id("contracts-customer")).sendKeys("TEST1234");
	 driver.findElement(By.xpath("//button[.='Save']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[.='Contracts']")).click();
 }
 
 public void addlocations() throws InterruptedException
 {
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[.='Locations']")).click();
     driver.findElement(By.xpath("//button[@ng-click='getCustomerLocations()']")).click();
	 Thread.sleep(20000);
	 driver.findElement(By.xpath("//td[.='479419084']/..//input[@type='checkbox']")).click();
	 waitTillElementVisible(driver.findElement(By.xpath("//button[.='Close']"))).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[.='Locations']")).click();
 }
}
