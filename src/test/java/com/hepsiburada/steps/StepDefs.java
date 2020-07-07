package com.hepsiburada.steps;

import com.hepsiburada.core.TestBase;
import com.hepsiburada.pages.HomePage;
import com.hepsiburada.pages.ProductDetailsPage;
import com.hepsiburada.pages.ResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class StepDefs extends TestBase {

    private HomePage homePage;
    private ProductDetailsPage productDetailsPage;
    private ResultPage resultPage;

    public StepDefs() {
        this.homePage = new HomePage(driver);
        this.productDetailsPage = new ProductDetailsPage(driver);
        this.resultPage = new ResultPage(driver);
    }

    @Given("User is on the HomePage")
    public void user_is_on_the_HomePage() throws IOException {
        homePage.navigateToHomePage();
    }

    @When("User should search for {string}")
    public void user_should_search_for(String productName) {
        homePage.searchProduct(productName);
    }

    @When("User should see the details of the {int}th product")
    public void user_should_see_the_details_of_the_fourth_product(int productIndex) throws InterruptedException {
        resultPage.seeProductDetailsPage(productIndex);
    }

    @When("User should see comments")
    public void user_should_see_comments() {
        productDetailsPage.clickOnCommentsTab();
    }

    @When("User should vote Yes for the first comment listed")
    public void user_should_vote_Yes_for_the_first_comment_listed() {
        productDetailsPage.clickOnYesForTheFirstComment();
    }

    @Then("User should see message {string}")
    public void user_should_see_message(String msg) {
        Assert.assertEquals(msg, productDetailsPage.seeThanksMessage(msg));
        tearDown();
    }
}