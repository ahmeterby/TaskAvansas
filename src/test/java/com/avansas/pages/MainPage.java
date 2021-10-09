package com.avansas.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage  {
    @FindBy(xpath = "//span[@class='name']")
    public WebElement üyeGirisi;
    @FindBy(name = "q")
    public WebElement searchBox;


}
