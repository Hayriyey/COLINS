package com.colins.pages;

import com.colins.utilities.BrowserUtils;
import com.colins.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//li[@class='login-link']")
    public WebElement logInLink;

    @FindBy(xpath = "//a[contains(text(),'ÜYE OL')]")
    public WebElement register;

    @FindBy(xpath = "//a[contains(text(),'Giriş Yap')]")
    public WebElement loginForm;

    @FindBy(xpath = "//input[@id='LoginModel_Email']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@id='LoginModel_Password']")
    public WebElement passwordTextBox;


    @FindBy(xpath = "//input[@value='GİRİŞ YAP']")
    public WebElement logInButton;


    public void makeSureLoginFormDisplayed(){
        BrowserUtils.waitForVisibility(loginForm, 10);
    }

    public void seeLoginForm(String username_str, String password_str){
        loginForm.click();
        String username= ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);



    }

}
