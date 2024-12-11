package stepdefination;

import io.cucumber.java.en.*;


public class RegisterPage {
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_accountpage()
	{
		System.out.println("--->navigates to Register Account page");
	}
	
	@When("User enters first name {string} into the First Name field")
	public void user_enters_first_name_into_the_first_name_field(String firstName) {
		System.out.println("--> User has entered first name" + firstName + " Into the First Name field");
	}

	@When("Enters lastname {string} into the Last Name field")
	public void enters_lastname_into_the_last_name_field(String lastName) {
		System.out.println("--> User has Entered lastname "+ lastName + " into the Last Name field");
	}

	@When("Enters email address {string} into the Email field")
	public void enters_email_address_into_the_email_field(String emailfield) {
		System.out.println("--> User has Entered email address "+ emailfield +" into the Email field");
	}

	@When("Enters telephone {string} into the Telephone field")
	public void enters_telephone_into_the_telephone_field(String string) {
	   System.out.println("-->entered phone number");
	}

	@When("Enters password {string} into the Password field")
	public void enters_password_into_the_password_field(String password) {
		System.out.println("--> User has Entered password " + password + " into the Password field");
	}

	@When("Enters password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String passwordConfirm) {
		System.out.println("--> User has Entered password " +passwordConfirm +" into the Password Confirm field");
	}
	
	@When("Selects Yes for Newsletter")
	public void selects_yes_for_newsletter()
	{
		System.out.println("--->Selects Yes for Newsletter");
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field()
	{
		System.out.println("--> User has Selected Privacy Policy field");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		System.out.println("--> User has Clicked on Continue button");
	}
	
	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println("--> User Account has successfully created ");
	}
	
	
	@When("User don't enter details into any fields")
	public void User_dont_enter_details_into_any_fields()
	{
		System.out.println("--->user not enter any details");
	}
	
	@Then("User  Warning message should be displayed for all mandatory fields")
	public void messgaedisplayed()
	{
		System.out.println("--->Warning message should be displayed for all mandatory fields");
	}
}