package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePageElements {

    public Select eurochoice(){

        WebElement euro = Hooks.driver.findElement(By.id("customerCurrency"));
        Select euroo = new Select(euro);
        return  euroo;
    }

    public List<WebElement> productsByEuro(){

            List<WebElement> eleList = Hooks.driver.findElements(By.className("price"));
            return eleList;
    }


    public WebElement searchBox(){

        WebElement searchBox = Hooks.driver.findElement(By.id("small-searchterms"));
        return searchBox;
    }

    public List<WebElement> productsTitle(){

        List<WebElement> proTitle = Hooks.driver.findElements(By.className("product-title"));
        return proTitle;
    }

    public WebElement skuElement(){

        WebElement skuelement = Hooks.driver.findElement(By.className("picture"));
        return skuelement;
    }

    public List<WebElement> categories(){

        List<WebElement> category = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return category;
    }

    public WebElement facebookIcon(){

        WebElement facebook =Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        return facebook;
    }

    public WebElement twitterIcon(){

        WebElement twitter =Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }

    public WebElement rssIcon(){

        WebElement rss =Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\""));
        return rss;
    }

    public WebElement youtubeIcon(){

        WebElement youtube =Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youtube;
    }
    public WebElement nokiaSlider(){

        WebElement nokiaSlider =Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"][1]"));
        return nokiaSlider;
    }

    public WebElement iphoneSlider(){

        WebElement iphoneSlider =Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"][2]"));
        return iphoneSlider;
    }

    public List<WebElement> wishListBtn(){

        List<WebElement> wishbtn = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
        return wishbtn;
    }
    public WebElement addProductToWishListSuccessMsh(){

        WebElement sucessMsg =Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return sucessMsg;
    }

    public WebElement wishListButton(){

        WebElement wishListButton =Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        return wishListButton;
    }

    public WebElement productQuatityValue(){

        WebElement quantity =Hooks.driver.findElement(By.className("qty-input"));
        return quantity;
    }
}
