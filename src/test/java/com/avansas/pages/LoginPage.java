package com.avansas.pages;

import com.avansas.utilities.BrowserUtils;
import com.avansas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "j_username")
    public WebElement userName;


    @FindBy(id = "j_password")
    public WebElement password;

    @FindBy(id = "loginSubmitButton")
    public WebElement submit;



    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        BrowserUtils.waitFor(15);
        submit.click();

    }


}
