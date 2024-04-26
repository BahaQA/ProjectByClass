package com.baha.step_definitions;

import com.baha.pages.WikiPage;
import com.baha.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiStepDefs {
        WikiPage wikiPage = new WikiPage();

    @Given("user is on the Home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user enters {string} in the search box")
    public void user_enters_in_the_search_box(String searchWord) {
        wikiPage.enterSearchWord(searchWord);
    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
        wikiPage.clickSearchButton();
    }

    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String expectedTitle) {
        wikiPage.verifyPageTitle(expectedTitle);
       }

}
