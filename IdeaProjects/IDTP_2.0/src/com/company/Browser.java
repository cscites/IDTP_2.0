package com.company;

import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.URL;

/**
 * Created by chris on 3/8/17.
 */
public class Browser {
    private static WebClient BROWSER = new WebClient();
    private static CookieManager COOKIEMANAGER = new CookieManager();


    public Browser(){
    }


    public HtmlPage page(String url) throws IOException {
        return BROWSER.getPage(url);
    }


    public HtmlPage currentPage() throws IOException {
        return page(BROWSER.getCurrentWindow().getEnclosedPage().getUrl().toString());
    }

    public void login(String username, String password) throws IOException {
        URL pLinkLogin = new URL("https://admin.practicelink.com/MyAccount/Login.aspx?urlPath=https://admin.practicelink.com/default.aspx");
        HtmlPage loginPage = page(pLinkLogin.toString());
        HtmlElement usernameField = loginPage.getElementByName("ctl00$ContentBody$Login1$TxtEmail");
        HtmlElement passwordField = loginPage.getElementByName("ctl00$ContentBody$Login1$PwdPassword");
        HtmlElement loginButton = loginPage.getElementByName("ctl00$ContentBody$Login1$BtnLogIn");
        HtmlElement rememberMe = loginPage.getElementByName("ctl00$ContentBody$Login1$CbRememberMe");
        usernameField.setAttribute("value", username);
        passwordField.setAttribute("value", password);
        rememberMe.setAttribute("checked", "true");
        loginButton.click();
        System.out.println(loginPage.asText());
        HtmlPage newPage = currentPage();
        System.out.println(newPage.asText());
    }

    public void getCandidate(String webCV) throws IOException {
        URL candidateURL = new URL("https://admin.practicelink.com/Content/Candidate/CandidateDetail.aspx?candidateId=" + webCV);
        HtmlPage candidatePage = page(candidateURL.toString());
        System.out.println(candidatePage.asText());
    }

}
