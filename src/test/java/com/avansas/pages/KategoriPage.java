package com.avansas.pages;

import com.avansas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KategoriPage extends BasePage{
    @FindBy(id = "select2-sort-container")
    public WebElement sıralama;

    public WebElement sıralamaSekli(String sıralama){
        return Driver.get().findElement(By.xpath( "//li[contains(text(),'"+sıralama+"')]"));
    }
}
