package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.HomePageElements;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    HomePageElements page =new HomePageElements();
    SoftAssert soft =new SoftAssert();

    @Given("user opens facebook link")
    public void clickingOnFacebookIcon() throws InterruptedException {

        Thread.sleep(2000);
        page.facebookIcon().click();
    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        Thread.sleep(2000);
        page.twitterIcon().click();
    }

    @Given("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        Thread.sleep(2000);
        page.rssIcon().click();
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        Thread.sleep(2000);
        page.youtubeIcon().click();
    }

    @Then("^\"(.*)\" is opened in new tab$")
    public void isOpenedInNewTab(String faceLink) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        soft.assertEquals(Hooks.driver.getCurrentUrl(),faceLink);
        soft.assertAll();
        Thread.sleep(3000);
        Hooks.driver.close();

    }

}
