package com.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	//Validate phones Items
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/h1/span[2]")
	public WebElement txtphones;

	
	//Shirt Link
	@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With &')]")
	public WebElement linkShirtItems;
}
