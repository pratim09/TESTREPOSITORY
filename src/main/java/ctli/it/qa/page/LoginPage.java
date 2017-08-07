package ctli.it.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ctli.it.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	 
	
	public void loginUserName(String uname) throws Throwable {
	  	driver.findElement(By.name("user")).sendKeys(uname);
	}
	
	public  void loginUserPassword(String userpwd) throws Throwable {
		
		driver.findElement(By.name("password")).sendKeys(userpwd);
	}
		
	public  void loginUserSubmit() throws Throwable {
	
		driver.findElement(By.xpath("//input[@src='images/btn_go.gif']")).click();
		
	}  	
	

	
		}
	


