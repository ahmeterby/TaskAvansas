package com.avansas.pages;

import com.avansas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public WebElement kategoriSec(String kategori){
        return Driver.get().findElement(By.xpath( "//img[@data-name='"+kategori+"']"));
    }
}
