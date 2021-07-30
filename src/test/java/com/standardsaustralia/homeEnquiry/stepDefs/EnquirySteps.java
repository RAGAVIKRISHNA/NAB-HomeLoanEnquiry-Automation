package com.standardsaustralia.homeEnquiry.stepDefs;

import com.standardsaustralia.homeloan.enquiry.pages.EnquiryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnquirySteps extends EnquiryPage{
		
	public EnquirySteps() {
		super();		
    	}

    @Given("^If you need to request a new home loan$")
    public void browser_is_opened() {
    	}
    
    @When("^I navigate to \"([^\"]*)\" URL$")
    public void user_is_navigated_to_URL(String a) {
        driver.get(a);    
    }
    
    @When("Select HomeLoan Option")
    public void choose_homeLoan() {
    	super.choose_homeLoan();
    	}
    
    @When("Request for a callback Option")
    public void request_callback() {
    	super.request_callback();
    }	
    
    @Then("I fill up the request form")
    public void provide_details() throws InterruptedException {    		
    	super.choose_category();
    }
    
    @Then("^she provides the first name as \"([^\"]*)\"$")
    public void enter_firstName(String firstName) throws InterruptedException {
    	super.provide_firstName(firstName);
    }
    
    @Then("^she provides the last name as \"([^\"]*)\"$")
    public void enter_lastName(String lastName) throws InterruptedException {
    	super.provide_lastName(lastName);
    }
    
    @Then("^she provides the email as \"([^\"]*)\"$")
    public void enter_email(String email) throws InterruptedException {
    	super.provide_email(email);
    }
    
    @Then("^she provides the phone number as \"([^\"]*)\"$")
    public void enter_phone(String phoneNumber) throws InterruptedException {
    	super.provide_phone(phoneNumber);
    }
    
    @Then("^she provides the state as \"([^\"]*)\"$")
    public void enter_state(String state) throws InterruptedException {
    	super.provide_state(state);
    }
    
    @Then("^I fill the form and submit$")
    public void provide_details1() throws InterruptedException {
    	super.provide_requestDetails();
    }
    
    @Then("^I close the browser$")
    public void closeBrowser() throws InterruptedException {
         driver.quit();
    }
    
}