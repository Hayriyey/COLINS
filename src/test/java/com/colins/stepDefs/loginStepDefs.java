package com.colins.stepDefs;

import com.colins.pages.LoginPage;
import com.colins.utilities.BrowserUtils;
import com.colins.utilities.ConfigurationReader;
import com.colins.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.lang.module.Configuration;

public class loginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
        loginPage.logInLink.click();

    }




    @When("user types valid username {string} and {string}")
    public void user_types_valid_username_and(String username_str, String password_str) {
       loginPage.seeLoginForm(username_str,password_str );
    }
    @When("user click to login button")
    public void user_click_to_login_button() {
        loginPage.logInButton.click();
    }

}
