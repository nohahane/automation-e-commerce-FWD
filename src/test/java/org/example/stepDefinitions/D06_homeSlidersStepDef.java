package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.HomePageElements;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {
    HomePageElements page =new HomePageElements();
    SoftAssert soft =new SoftAssert();
    @Given("user click on Nokia slider")
    public void clickOnNokiaSlider(){
        page.nokiaSlider().click();

    }

    @Given("user click on Iphone slider")
    public void clickOnIphoneSlider(){
        page.iphoneSlider().click();

    }

    @Then("^\"(.*)\" is opened$")
    public void isOpened(String sliderLink) throws InterruptedException {
        Thread.sleep(2000);
        soft.assertEquals(sliderLink,Hooks.driver.getCurrentUrl());

    }
}
