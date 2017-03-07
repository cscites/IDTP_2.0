package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by chris on 3/7/17.
 */
public class Candidate {
    private String webCV;
    Scanner scanner = new Scanner(System.in);

    public Candidate() throws IOException, URISyntaxException {
        //Login2 login2 = new Login2();
        setWebCV();
        URL candidateURL = new URL("https://admin.practicelink.com/Content/Candidate/ContactInfoDetail.aspx?" +
                "candidateId="+webCV);
        WebDriver driver = new HtmlUnitDriver();
        driver.get(candidateURL.toString());
        //WebElement candidateName = driver.findElement(By.id("ctl00_ContentBody_NameInfoEdit1_TxtFirstName"));
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();

    }

    public void setWebCV(){
        System.out.println("Enter Web CV #");
        webCV = scanner.nextLine();
    }
}
