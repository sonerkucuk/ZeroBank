package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="signin_button")
    public  WebElement signInUp;

    @FindBy(id="user_login")
    public WebElement login;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signIn;
//    public void login(String userNameStr, String passwordStr) {
//        signInUp.click();
//        login.sendKeys(userNameStr);
//        password.sendKeys(passwordStr);
//        signIn.click();
//        // verification that we logged
//    }
}