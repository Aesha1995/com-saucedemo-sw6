package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productMsg;
    By productSize = By.xpath("//div[@class='inventory_item']");
    public String getProductText(){

        return getTextFromElement(productMsg);
    }
    public int getProductSize(){
        List<WebElement> productLength = driver.findElements(productSize);
        return productLength.size();
    }
}
