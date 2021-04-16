package com.maven.tommyhilfiger.stepdefs;

import com.maven.tommyhilfiger.pageobjects.Basket;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BasketStepDef {
    Basket  basket = new Basket();

    @Given("^I  am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basket.agree();
        basket.category(item);
    }

    @And("^I select sublist \"([^\"]*)\"$")
    public void iSelectSublist(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basket.sublist(item);
    }

    @And("^I select sublist filters \"([^\"]*)\"$")
    public void iSelectSublistFilters(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basket.sublistFilters(item);
    }

    @And("^I select subFilters \"([^\"]*)\"$")
    public void iSelectSubFilters(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basket.subFilter(item);
    }

    @And("^I select random product\"([^\"]*)\"$")
    public void iSelectRandomProduct(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basket.products();
        basket.del();
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String item) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        basket.size(item);
        basket.atb();
    }
}

