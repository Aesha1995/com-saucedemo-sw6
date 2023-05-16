package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class LoginTestSteps {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @When("^I enter user name \"([^\"]*)\"$")
    public void iEnterUserName(String userName){
        new LoginPage().enterUserName(userName);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("^verify the product text \"([^\"]*)\"$")
    public void verifyTheProductText(String productText){
        assertEquals(new ProductPage().getProductText(),productText,"Error message : Product text not match");
    }

    @Then("^verify the product quantity \"([^\"]*)\"$")
    public void verifyTheProductQuantity(int quantity) {
        Assert.assertEquals(new ProductPage().getProductSize(),quantity);
    }
}