package com.colins.stepDefs;

import com.colins.pages.LoginPage;
import com.colins.pages.OrderPage;
import com.colins.utilities.BrowserUtils;
import com.colins.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderStepDefs {
    LoginPage loginPage = new LoginPage();
    OrderPage orderPage= new OrderPage();

    @When("the user clicks {string} and {string}")
    public void the_user_clicks_and(String string, String string2) {
        BrowserUtils.waitFor(2);
        BrowserUtils.hover(orderPage.Kadın);
        BrowserUtils.waitFor(2);
        orderPage.Kaban.click();
    }

    @When("the user clicks {string} button")
    public void the_user_clicks_button(String string) {
        BrowserUtils.waitFor(2);
        orderPage.Kaban1.click();
    }

    @Then("the user selects beden")
    public void the_user_selects_beden() {
        WebElement dropdownBeden= Driver.get().findElement(By.xpath("//select[@id='product_attribute_27507_2_27496']"));
        Select bedenSize= new Select(dropdownBeden);
        System.out.println("bedenSize.getOptions().size() = " + bedenSize.getOptions().size());

        bedenSize.selectByVisibleText("XS");
    }

    @Then("the user should click {string}")
    public void the_user_should_click(String string) {
        BrowserUtils.waitFor(1);
        orderPage.sepeteEkle.click();
    }


}
