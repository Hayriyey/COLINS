package com.colins.stepDefs;

import com.colins.pages.MenuPage;
import com.colins.utilities.BrowserUtils;
import com.colins.utilities.ConfigurationReader;
import com.colins.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class menuStepDefs {
MenuPage menuPage=new MenuPage();
    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        //get the list of webelement and convert them to list of string and assert
        List<String> actualOptions = BrowserUtils.getElementsText(menuPage.menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);

    }


    @And("Verify the number of products of each menu")
    public void verifyTheNumberOfProductsOfEachMenu() {
        menuPage.colinsMenu();
    }
}
