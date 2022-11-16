package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.HomePageElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    HomePageElements page = new HomePageElements();
    SoftAssert soft =new SoftAssert();

    @Given("^user enter a \"(.*)\" in search box and click on search button$")
    public void clickOnSearchBox(String Keyword){
        page.searchBox().sendKeys(Keyword);
        page.searchBox().sendKeys(Keys.ENTER);
    }

    @Then("^search results matching \"(.*)\" should appears$")
    public void searchMatchResult(String Keyword) {
        // Assert product size
        Assert.assertTrue("Failed to assert",Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        int size =Hooks.driver.findElements(By.className("details")).size();
       Assert.assertEquals(size,Hooks.driver.findElements(By.className("details")).size());

        // Assert product Count

       for (int i=0; i<=size-1; i++){
           //System.out.println(page.productsTitle().get(i).getText());
          Assert.assertTrue(page.productsTitle().get(i).getText().toLowerCase().contains(Keyword));

          soft.assertAll();
       }
    }

    @Given("^user enter a serial \"(.*)\" in search box and click on search button$")
    public void searchBySku(String sku) {
        page.searchBox().sendKeys(sku);
        page.searchBox().sendKeys(Keys.ENTER);
    }

    @And("user click on appeared product")
    public void userClickOnAppearedProduct() {

        page.skuElement().click();
    }

    @Then("^Sku appears in results equals entered \"(.*)\"$")
    public void skuAppearsInResultsEqualsEntered(String sku) {

        soft.assertTrue(Hooks.driver.findElement(By.className("additional-details")).getText().contains(sku));

    }
}
