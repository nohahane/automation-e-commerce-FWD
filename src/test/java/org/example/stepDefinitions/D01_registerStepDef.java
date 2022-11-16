package org.example.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.example.Pages.RegisterElements;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    RegisterElements reg =new RegisterElements();
    SoftAssert soft = new SoftAssert();

    @Given("user go to register page")
    public void goToRegister(){

        reg.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        reg.genderRadioBtn().click();

    }

    @And("user enter first name")
    public void userEnterFirstName() {

        reg.firstName().sendKeys("automation");
    }

    @And("user Enter last name")
    public void userEnterLastName() {

        reg.lastName().sendKeys("tester");
    }


    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        reg.day().selectByValue("3");
        reg.month().selectByValue("5");
        reg.year().selectByValue("1996");
    }

    @And("user enter email field")
    public void userEnterEmailField() {
 // External dependancy i used for generating different email every time
        Faker fake =new Faker();
        String Name = fake.name().firstName();
        reg.email().sendKeys(Name+"@example.com");
    }

    @And("user fills Password fields")
    public void userFillsPasswordFields() {
        reg.firstPassword().sendKeys("P@ssw0rd");
        reg.confirmPassword().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {

        reg.registerButton().click();
    }

    @And("success message is displayed")
    public void successMessageIsDisplayed() {

        String expected ="Your registration completed";
        String actual = reg.registermessage().getText();
        soft.assertEquals(true,actual.contains(expected));
        System.out.println("sucess");
    }
}
