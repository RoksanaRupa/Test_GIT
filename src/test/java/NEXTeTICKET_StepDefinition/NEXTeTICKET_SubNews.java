package NEXTeTICKET_StepDefinition;

import NEXTeTICKET_PageAction.NEXTeTICKET_HomePageAction;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NEXTeTICKET_SubNews extends NEXTeTICKET_Base {
	
	 NEXTeTICKET_HomePageAction  neT_homePageAction = new  NEXTeTICKET_HomePageAction();
	 
	 @Given("^Open NEXTeTICKET <\"([^\"]*)\"> application$")
	 public void open_NEXTeTICKET_application(String URL) throws Throwable {
		 NetLaunchURL(URL);
	 }
	 
	 
	
	@Then("^scroll down til Subscribe To Newsletter area$")
	public void scroll_down_til_Subscribe_To_Newsletter_area() throws Throwable {
		
		neT_homePageAction.scrolldowntilSubscribeToNewsletterarea();
		
	}

	@Then("^verify Subscribe To Newsletter is displaying in home page footer$")
	public void verify_Subscribe_To_Newsletter_is_displaying_in_home_page_footer() throws Throwable {
		
		neT_homePageAction.verifySubscribeToNewsletterisdisplayinginhomepagefooter();
	}

	@Then("^Verify Email field is displaying in Subscribe To Newsletter$")
	public void verify_Email_field_is_displaying_in_Subscribe_To_Newsletter() throws Throwable {
		
		neT_homePageAction.VerifyEmailfieldisdisplayinginSubscribeToNewsletter();
	    
	}

	@Then("^Verify send button is displaying in Subscribe To Newsletter$")
	public void verify_send_button_is_displaying_in_Subscribe_To_Newsletter() throws Throwable {
	   
		neT_homePageAction.VerifysendbuttonisdisplayinginSubscribeToNewsletter();
	   
	   
	}

	@Then("^Enter valid email address and click send button$")
	public void enter_valid_email_address_and_click_send_button() throws Throwable {
		
		neT_homePageAction.Entervalidemailaddressandclicksendbutton(NetPro.getProperty("NetEmail"));
		
	   
	}

	@Then("^Verify success message\\(Your submission was successful\\)appeared when send with email$")
	public void verify_success_message_Your_submission_was_successful_appeared_when_send_with_email() throws Throwable {
		
		neT_homePageAction.VerifysuccessmessageYoursubmissionwassuccessfulappearedwhensendwithemail();
	    
	}
	
	@Then("^skip email address and click send button$")
	public void skip_email_address_and_click_send_button() throws Throwable {
		
		neT_homePageAction.skipemailaddressandclicksendbutton();
	    
	}

	@Then("^Verify error message\\(Please fill out this field\\)appeared when send without email$")
	public void verify_error_message_Please_fill_out_this_field_appeared_when_send_without_email() throws Throwable {
		
		neT_homePageAction.VerifyerrormessagePleasefilloutthisfieldappearedwhensendwithoutemail();
	   
	}

}
