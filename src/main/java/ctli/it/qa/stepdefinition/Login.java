package ctli.it.qa.stepdefinition;

import ctli.it.qa.base.BaseClass;
import ctli.it.qa.page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class Login extends BaseClass {
	
	LoginPage loginpage = new LoginPage();
	
	
	@Given("^As a UWS user open the application$")
	public void as_a_UWS_user_open_the_application() throws Throwable {
		openURL();
	}

	@Given("^enters \"([^\"]*)\" as username$")
	public void enters_as_username(String username) throws Throwable {
		 loginpage.loginUserName(username);
	}

	@Given("^enters \"([^\"]*)\" as password$")
	public void enters_as_password(String password) throws Throwable {
	    loginpage.loginUserPassword(password);
	}

	@Given("^submit it$")
	public void submit_it() throws Throwable {
	    loginpage.loginUserSubmit();
	    
	}
}
