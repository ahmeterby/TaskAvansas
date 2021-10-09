package com.avansas.pages;

import com.avansas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ÜrünPage extends BasePage {
    public List<WebElement> arananÜrünListesi(String aranaÜrün){
        return  Driver.get().findElements(By.xpath("//div[contains(@data-product-name,'"+aranaÜrün+"')]"));
    }
}
