package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterElements {

    // Resister Link web element

    public WebElement registerLink(){

        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }

    public WebElement genderRadioBtn(){

        WebElement radiobtn = Hooks.driver.findElement(By.id("gender-male"));
        return radiobtn;
    }

    public WebElement firstName(){

        WebElement fname = Hooks.driver.findElement(By.id("FirstName"));
        return fname;
    }

    public  WebElement lastName(){

        WebElement lastname = Hooks.driver.findElement(By.id("LastName"));
        return lastname ;
    }

    public Select day(){

        WebElement daylist = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select day =new Select(daylist);
        return day;
    }

    public Select month(){

        WebElement monthlist = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select month =new Select(monthlist);
        return month;
    }

    public Select year(){

        WebElement yearlist = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select year =new Select(yearlist);
        return year;
    }

    public WebElement email(){

        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement firstPassword(){

        WebElement pass1 = Hooks.driver.findElement(By.id("Password"));
        return pass1;
    }


    public WebElement confirmPassword(){

        WebElement pass2 = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return pass2;
    }

    public WebElement registerButton(){

        WebElement registerbtn = Hooks.driver.findElement(By.id("register-button"));
        return registerbtn;
    }

    public WebElement registermessage(){

        WebElement registermsg = Hooks.driver.findElement(By.className("result"));
        return registermsg;
    }
}
