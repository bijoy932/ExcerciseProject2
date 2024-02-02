package com.ebay.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ebay.pageElements.EbaySearchResultLocators;
import com.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsobj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsobj=new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsobj);
		
	}
	
	public void verifyPhonesItems(){
		//Option 1
		Assert.assertEquals("phones", EbaySearchResultLocatorsobj.txtphones.getText());
		
		//Option 2
		Assert.assertTrue(EbaySearchResultLocatorsobj.txtphones.isDisplayed());
	}
	
	public void SelectCottonTee(){
		EbaySearchResultLocatorsobj.linkShirtItems.click();
		
	}
	
}

