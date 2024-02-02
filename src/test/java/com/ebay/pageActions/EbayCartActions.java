package com.ebay.pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.pageElements.EbayCartLocators;
import com.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj=new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver,EbayCartLocatorsObj);
	}
	
	public void switchNewWindow(){
		for(String winhandle: SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winhandle);
		}
	}
	
	public void selectSizeTypeDD() throws Exception{
		Select dropDown=new Select(EbayCartLocatorsObj.ddSizeType);
		dropDown.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
	}
	
	public void selectMenSizeDD() throws Exception{
		Select dropDown=new Select(EbayCartLocatorsObj.ddSizeMens);
//		dropDown.selectByVisibleText("4XLT");
		dropDown.selectByIndex(1);
		Thread.sleep(2000);
	}
	
	public void selectShade() throws Exception{
		Select dropDown=new Select(EbayCartLocatorsObj.ddShade);
//		dropDown.selectByIndex(15);
		dropDown.selectByValue("15");
		Thread.sleep(2000);
	}
	
	public void enterQuantity() throws Exception{
		EbayCartLocatorsObj.txtbxQty.clear();
		EbayCartLocatorsObj.txtbxQty.sendKeys("2");
		Thread.sleep(2000);
	}
	
	public void AddToCart() throws Exception{
		EbayCartLocatorsObj.btnAddCart.click();
		Thread.sleep(2000);
	}

}
