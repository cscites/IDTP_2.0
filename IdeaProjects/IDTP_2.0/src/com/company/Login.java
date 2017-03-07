package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;


/**
 * Created by chris.scites on 3/6/2017.
 */
public class Login {
    URL loginURL = new URL("https://admin.practicelink.com/MyAccount/Login.aspx?urlPath=https://admin.practicelink.com/default.aspx");
    Scanner scanner = new Scanner(System.in);
    private String email;
    private String password;

    public Login() throws IOException {
        setEmail();
        setPassword();

        WebDriver driver = new HtmlUnitDriver();
        driver.get(loginURL.toString());
        WebElement emailInput = driver.findElement(By.name("ctl00$ContentBody$Login1$PwdPassword"));
        WebElement pwInput = driver.findElement(By.name("ctl00$ContentBody$Login1$PwdPassword"));
        WebElement submitButton = driver.findElement(By.name("ctl00$ContentBody$Login1$BtnLogIn"));
        WebElement stayLoggedIn = driver.findElement(By.name("ctl00$ContentBody$Login1$CbRememberMe"));
        emailInput.sendKeys(email);
        pwInput.sendKeys(password);
        stayLoggedIn.isSelected();
        submitButton.click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();

    }



    public void setEmail(){
        System.out.println("Please enter login email.");
        email = scanner.nextLine();
    }

    public void setPassword(){
        System.out.println("Please enter your password.");
        password = scanner.nextLine();
    }
}