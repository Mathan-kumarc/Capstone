package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebUniversity {
WebDriver driver;
@FindBy(id="iframe")
WebElement contact;
public WebElement getContact() {
	return contact;
}

public WebUniversity(WebDriver rDriver) {
	this.driver= rDriver;
	PageFactory.initElements(rDriver, this);
}

}