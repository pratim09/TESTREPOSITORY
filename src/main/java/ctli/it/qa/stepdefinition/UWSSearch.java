package ctli.it.qa.stepdefinition;

import ctli.it.qa.page.UWSSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class UWSSearch {
	
	UWSSearchPage usp = new UWSSearchPage();

	@When("^I enter the \"([^\"]*)\" as customername and search by customer name$")
	public void i_enter_the_as_customername_and_search_by_customer_name(String custname) throws Throwable {
		 usp.uwsCustomerSearch(custname);
		 usp.uwsSearchSubmit();
	
	}

	@When("^Navigates to the customer overview page$")
	public void navigates_to_the_customer_overview_page() throws Throwable {
		 System.out.println("Hello");
	}

	@When("^create new order$")
	public void create_new_order() throws Throwable {
		 System.out.println("Hello");
	}
}
