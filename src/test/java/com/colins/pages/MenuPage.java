package com.colins.pages;

import com.colins.utilities.BrowserUtils;
import com.colins.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage extends BasePage {

    @FindBy(xpath = "(//li[@class='menu-wrapper float-left list-style-none'])")
    public List<WebElement> menuOptions;

public void colinsMenu() {
    for (int i = 0; i < menuOptions.size(); i++) {
        menuOptions.get(i).click();
        String menuNames= menuOptions.get(i).getText();
        switch (menuNames) {
            case "JEAN":
                BrowserUtils.waitFor(2);
                String actualverifySentence1= Driver.get().findElement(By.xpath("(//p[@class='product-count-text'])[1]")).getText();
                String expectedvrifySentence1="813 ürün bulundu";
                Assert.assertEquals(expectedvrifySentence1,actualverifySentence1);
                break;
            case "KADIN":
                BrowserUtils.waitFor(2);
                String actualverifySentence2= Driver.get().findElement(By.xpath("//span[@id='product-count']")).getText();
                String expectedvrifySentence2="2483";
                Assert.assertEquals(expectedvrifySentence2,actualverifySentence2);
                break;
            case "ERKEK":
                BrowserUtils.waitFor(2);
                String actualverifySentence3= Driver.get().findElement(By.xpath("//span[@id='product-count']")).getText();
                String expectedvrifySentence3="2823";
                Assert.assertEquals(expectedvrifySentence3,actualverifySentence3);
                break;
            case "YENİ SEZON":
                BrowserUtils.waitFor(2);
                String actualverifySentence4= Driver.get().findElement(By.xpath("//span[@id='product-count']")).getText();
                String expectedvrifySentence4="882";
                Assert.assertEquals(expectedvrifySentence4,actualverifySentence4);
                break;
            case "OUTLET":
                BrowserUtils.waitFor(2);
                String actualverifySentence5= Driver.get().findElement(By.xpath("//span[@id='product-count']")).getText();
                String expectedvrifySentence5="2894";
                Assert.assertEquals(expectedvrifySentence5,actualverifySentence5);
                break;
            case "JEAN GUIDE":
                BrowserUtils.waitFor(2);
                String actualverifySentence6= Driver.get().findElement(By.xpath("//p[@class='jean-guide-woman']")).getText();
                String expectedvrifySentence6="jean-guide-woman";
                Assert.assertEquals(expectedvrifySentence6,actualverifySentence6);
                break;

        }
    }

}
}
