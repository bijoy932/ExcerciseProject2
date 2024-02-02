package com.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {

	
	//Shirt Size Type
	@FindBy(xpath="//select[@aria-label='Please select a Size Type']")
	public WebElement ddSizeType;
	
	
	//Shirt Size Mens
	@FindBy(xpath="//select[@id='x-msku__select-box-1001']")
	public WebElement ddSizeMens;
	
	
	//Shirt Shade
	@FindBy(xpath="//select[@id='x-msku__select-box-1002']")
	public WebElement ddShade;
	
	
	//Shirt Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	
	//Add to Cart
	@FindBy(xpath="//*[@id=\"mainContent\"]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
	public WebElement btnAddCart;
	
	
}
