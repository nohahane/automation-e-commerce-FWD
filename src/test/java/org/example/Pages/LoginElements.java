package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginElements {

    public WebElement loginButton(){

        WebElement login = Hooks.driver.findElement(By.className("ico-login"));
        return login;
        }

        public WebElement loginEmail(){

            WebElement email = Hooks.driver.findElement(By.id("Email"));
            return email;
        }

    public WebElement loginPassword(){

        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement loginSubmit(){

        WebElement loginsubmit = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return loginsubmit;
    }
    public WebElement errorMsg(){

        WebElement errormsg = Hooks.driver.findElement(By.className("message-error"));
        return errormsg;
    }
    }


