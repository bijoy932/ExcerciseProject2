package com.ebay.stepDef;

import com.ebay.pageActions.EbaySearchResultActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Then("^Item list should have only phone related products$")
	public void item_list_should_have_only_phone_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyPhonesItems();
	}
	
	@When("^Select the first shirt on item list$")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.SelectCottonTee();
	}
	
}
