package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.HomePageElements;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class
D08_WishlistStepDef {
    HomePageElements page =new HomePageElements();
    SoftAssert soft =new SoftAssert();

    @Given("user click on wish list button for a product")
    public void clickOnWishButton() throws InterruptedException {
        Thread.sleep(2000);
        page.wishListBtn().get(2).click();
    }

    @Then("Green success message appears")
    public void greenSuccessMessageAppears() {
        String suceessMsg =page.addProductToWishListSuccessMsh().getText();
        String expectedSuccessMsg ="The product has been added to your wishlist";

        //Assert Background color
        String sucessMsgBackground =page.addProductToWishListSuccessMsh().getCssValue("background-color");

       // System.out.println(sucessMsgBackground);

        String Expectedcolor = Color.fromString("rgba(75, 176, 122, 1)").asHex();
        String ActualBackgroundcolor=Color.fromString(sucessMsgBackground).asHex();

        soft.assertTrue(suceessMsg.contains(expectedSuccessMsg));
        soft.assertEquals(Expectedcolor,ActualBackgroundcolor);
        soft.assertAll();
    }

    @Then("user click on wish List tab on top page")
    public void userClickOnWishListTabOnTopPage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(page.addProductToWishListSuccessMsh()));

        page.wishListButton().click();
    }

    @Then("user find product quantity valu is mor than one")
    public void userFindProductQuantityValuIsMorThan() {
       String productQuantity= page.productQuatityValue().getAttribute("value");
       System.out.println("Valuee "+productQuantity);
       int value =Integer.parseInt(productQuantity);
       soft.assertTrue(value>0);
    }
}
