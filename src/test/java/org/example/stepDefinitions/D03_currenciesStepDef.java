package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.HomePageElements;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {

    HomePageElements page =new HomePageElements();
    SoftAssert soft = new SoftAssert();

    @Given("user select euro from up left button on home page")
    public void changeCurrancy(){

        page.eurochoice().selectByVisibleText("Euro");
    }

    @Then("Currancy for products appears on home page change into Euro")
    public void getProductsCurrancy() {

        for (int i=0 ; i<4 ; i++){

         String txt= page.productsByEuro().get(i).getText();
         String euroSign ="€";
         soft.assertEquals(true,txt.contains(euroSign));

         // Didn't use soft assert here as required in requirmints
        }
    }
}
