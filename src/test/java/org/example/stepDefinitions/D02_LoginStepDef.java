package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.LoginElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {

    LoginElements login = new LoginElements();
    SoftAssert soft =new SoftAssert();
    @Given("user go to login page")
    public void userLogin(){
        login.loginButton().click();
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginSubmit().click();
    }

    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void userLoginWithAnd(String email, String password) {
        login.loginEmail().sendKeys(email);
        login.loginPassword().sendKeys(password);
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {

        soft.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());
        soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

        String errorMsg = login.errorMsg().getText();
        String ExpectedErrorMsg ="Login was unsuccessful";
        String Expectedcolor = Color.fromString("rgba(228, 67, 75, 1)").asHex();
        String errorcolor =login.errorMsg().getCssValue("color");
        String Actualhexerrorcolor=Color.fromString(errorcolor).asHex();
        soft.assertTrue(errorMsg.contains(ExpectedErrorMsg));
        soft.assertEquals(Expectedcolor,Actualhexerrorcolor);
        soft.assertAll();
    }
}
