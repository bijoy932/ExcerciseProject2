package com.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
	
	//Selenium Page Factory
	
	//Search text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	
	//Search Button
	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	public WebElement btnSearch;
			
		

}
