package com.baha.step_definitions;

import com.baha.pages.WikiPage_By;
import com.baha.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WikiStepDefs_By {
    WikiPage_By wikiPageBy = new WikiPage_By();



    @Given("User is on the Home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User enters {string} in the search box")
    public void user_enters_in_the_search_box(String searchWord) {
        wikiPageBy.enterSearchWord(searchWord);

    }

    @When("User clicks on the search button")
    public void user_clicks_on_the_search_button() {
        wikiPageBy.clickSearchButton();

    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String expectedTitle) {

        wikiPageBy.verifyPageTitle(expectedTitle);
    }
}
