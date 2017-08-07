package ctli.it.qa.stepdefinition;

import ctli.it.qa.page.OrderQuotingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.WEN;

public class NewinstallStepDefinition {
	OrderQuotingPage oqp=new OrderQuotingPage();
	

		@When("^Navigate to the order quoting page$")
	public void navigate_to_the_order_quoting_page() throws Throwable {
			oqp.Customer_Overview_Page();
	}

		@When("^I add the  customeraccountid and productaccounts$")
		public void i_add_the_customeraccountid_and_productaccounts() throws Throwable {
		oqp.addaccount();
	}
		
		@When("^Add ParamataID as contracts$")
		public void add_ParamataID_as_contracts() throws Throwable {
		 oqp.contracts();
	}

	@When("^Add Locations as GetExisitngLocations from the list$")
	public void add_Locations_as_GetExisitngLocations_from_the_list() throws Throwable {
		oqp.addlocations();
	}

	@When("^Add Contact as GetExistingContacts$")
	public void add_Contact_as_GetExistingContacts() throws Throwable {
		 System.out.println("Hello");
	}

	@When("^Add Party roles for the locations for the added contact$")
	public void add_Party_roles_for_the_locations_for_the_added_contact() throws Throwable {
		 System.out.println("Hello");
	}

	@Then("^Under Products/Services configure CE services$")
	public void under_Products_Services_configure_CE_services() throws Throwable {
		 System.out.println("Hello");
	}

	@Then("^Add Offnet Uni for the selected locations$")
	public void add_Offnet_Uni_for_the_selected_locations() throws Throwable {
		 System.out.println("Hello");
	}

	@Then("^verify the NMI Local Access type$")
	public void verify_the_NMI_Local_Access_type() throws Throwable {
		 System.out.println("Hello");
	}

	@Then("^also verify the buildout option for added UNI$")
	public void also_verify_the_buildout_option_for_added_UNI() throws Throwable {
		 System.out.println("Hello");
	}



}
