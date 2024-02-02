package com.ebay.pageActions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.pageElements.EbayHomepageLocators;
import com.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsobj;
	
	public EbayHomepageActions(){
		EbayHomepageLocatorsobj=new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsobj);
		
	}
	
	public void loadHomepage(){
		// Selenium Wait : 1. Implicit wait(Global), 2. Explicit wait(Conditional), 3. Fluent wait(Intermittent)
		
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Implicit wait
		
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsobj.txtbxSearch));
	}
	
	public void searchphones(){
		EbayHomepageLocatorsobj.txtbxSearch.sendKeys("phones");
		EbayHomepageLocatorsobj.btnSearch.click();
		
	}
	
	public void searchCottonTee(){
		EbayHomepageLocatorsobj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomepageLocatorsobj.btnSearch.click();
		
	}
	
}
