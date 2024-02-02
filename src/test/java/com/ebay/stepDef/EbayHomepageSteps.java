package com.ebay.stepDef;

import com.ebay.pageActions.EbayHomepageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsobj=new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomepageActionsobj.loadHomepage();
		}
	    	    
	    @When("^Search for phone$")
	    public void search_for_phone() throws Throwable {
	    	EbayHomepageActionsobj.searchphones();
	        
	    }
	    
	    @Given("^Search for Shirt$")
	    public void search_for_Shirt() throws Throwable {
	    	EbayHomepageActionsobj.searchCottonTee();

	    }

	    

}
