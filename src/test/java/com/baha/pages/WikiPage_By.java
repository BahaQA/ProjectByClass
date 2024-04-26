package com.baha.pages;

import com.baha.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage_By {



    private By searchInput = By.cssSelector("input[id='searchInput']");
    private By searchButton = By.cssSelector("i[class='sprite svg-search-icon']");
    private By pageTitle = By.cssSelector("span[class='mw-page-title-main']");


    public void enterSearchWord(String searchWord){
        Driver.getDriver().findElement(searchInput).sendKeys(searchWord);
    }


    public void clickSearchButton(){
        Driver.getDriver().findElement(searchButton).click();

    }


    public void verifyPageTitle(String expectedPageTitle){
        String actualTitle = Driver.getDriver().findElement(pageTitle).getText();
        Assert.assertEquals(expectedPageTitle, actualTitle);
    }


}
