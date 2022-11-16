package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver =null;

    @Before
    public static void openBrowser(){
        // 1- locate chrome driver path
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA PROJECTS\\FWD_Maven\\src\\main\\resources\\chromedriver.exe");

        //2- Object of webdriver
        driver= new ChromeDriver() ;

        // 3- Go to website URL
        driver.navigate().to("https://demo.nopcommerce.com/");

        // 4- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @After
    public static void quitBrowser() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

}

}
