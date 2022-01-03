package com.colins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {
    @FindBy(xpath = "(//a[@href='/c/kadin-giyim-57'])[1]")
    public WebElement Kadın;
    @FindBy(xpath = "(//a[@href=\"/c/woman-outwear-259\"])[1]")
    public WebElement Kaban;
    @FindBy(xpath = "//a[contains(text(),'Regular Fir Kapişonlu Çok Cepli Kırmızı Kadın Kaba')]")
    public WebElement Kaban1;
    @FindBy(xpath = "//select[@id='product_attribute_27507_2_27496']")
    public WebElement bedenSec;
    @FindBy(xpath = "//span[contains(text(),'SEPETE EKLE')]")
    public WebElement sepeteEkle;






}
