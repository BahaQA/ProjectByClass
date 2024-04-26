package com.baha.pages;

import com.baha.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class WikiPage {

    //public WikiPage() {PageFactory.initElements(Driver.getDriver(),this);}
    public WikiPage(){
        PageFactory.initElements(new AjaxElementLocatorFactory(Driver.getDriver(), 20), this);
    }


    @CacheLookup
    @FindBy(css = "input[id='searchInput']")
    private WebElement searchInput;


    @FindBy(css = "i[class='sprite svg-search-icon']")
    private WebElement searchButton;


    @FindBy(css = "span[class='mw-page-title-main']")
    private WebElement pageTitle;


    public void enterSearchWord(String searchWord){
        searchInput.sendKeys(searchWord);
    }


    public void clickSearchButton(){
        searchButton.click();
    }


    public void verifyPageTitle(String expectedPageTitle){
        String actualPageTitle = pageTitle.getText();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }




}
