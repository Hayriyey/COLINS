package com.colins.pages;


import com.colins.utilities.BrowserUtils;
import com.colins.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }



    @FindBy(xpath = "//li[@class='menu-wrapper float-left list-style-none']")
    public  WebElement menuIcons;


    @FindBy(xpath = "//a[@class='email']")
    public WebElement email;

    @FindBy(xpath = "//a[@class='cc-btn cc-dismiss']")
    public  WebElement accept;




    }




