@regression @smoke @SKYW-15 @E2E
Feature: Ebay Search Functionality

	Scenario: Search for Phones
		Given Open Ebay Homepage
		When Search for phones
		Then Item list should have only phones related products	