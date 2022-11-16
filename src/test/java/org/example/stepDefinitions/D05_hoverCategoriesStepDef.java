package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.HomePageElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;



public class D05_hoverCategoriesStepDef {

    HomePageElements page =new HomePageElements();
    Actions action =new Actions(Hooks.driver);
    SoftAssert soft =new SoftAssert();

     int random;
    @Given("user hover on a category")
    public void categoryHover() throws InterruptedException {

         random = new Random().nextInt(3);

        action.moveToElement(page.categories().get(random)).perform();
    }

    @Then("Title of selected subcategory is equal to subcategory name")
    public void selectOnOfTheSubcategories() throws InterruptedException {

        int catNum = random+1;
        List<WebElement> subcategory = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+catNum+"]/ul[@class=\"sublist first-level\"]/li"));
        String categoryTitle = subcategory.get(random).getText();
        subcategory.get(random).click();
       soft.assertEquals(categoryTitle,Hooks.driver.findElement(By.className("page-title")).getText());


    }


}
