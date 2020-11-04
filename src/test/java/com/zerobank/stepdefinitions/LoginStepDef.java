package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
     LoginPage loginPage= new LoginPage();

      @Given("the user is on the login page")
      public void the_user_is_on_the_login_page() {
       String url= ConfigurationReader.get("url");
       Driver.get().get(url);
      }


      @When("the user enters the valid credentials")
      public void the_user_enters_the_user_information() {

       loginPage.signInUp.click();
       BrowserUtils.waitFor(3);
//       String username=ConfigurationReader.get("username");
       loginPage.login.sendKeys("username");
       BrowserUtils.waitFor(3);
      // String password=ConfigurationReader.get("password");
       loginPage.password.sendKeys("password");
       loginPage.signIn.click();


      }
      @Then("the user should be able to login")
      public void the_user_should_be_able_to_login() {
       BrowserUtils.waitFor(3);
       String actualTitle=Driver.get().getTitle();
       Assert.assertEquals("Zero - Account Summary",actualTitle);
      }

      @When("the user should not be able to login with invalid {string} {string}")
      public void the_user_should_not_be_able_to_login_with_invalid(String string, String string2) {
      loginPage.signInUp.click();

      Assert.assertEquals(string="username",string2="password");

      }


      @Then("the error message should displayed")
      public void the_error_message_should_displayed() {


      }


}