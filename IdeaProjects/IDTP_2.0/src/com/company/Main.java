package com.company;


import com.gargoylesoftware.htmlunit.html.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Browser browser = new Browser();
        String url = "https://www.google.com";
        HtmlPage page = browser.page(url);
        System.out.println(page.asText());

        HtmlElement search = page.getElementByName("q");
        search.setAttribute("value", "Cats");
        HtmlElement go = page.getElementByName("btnK");
        go.click();
        HtmlPage page1 = browser.currentPage();
        System.out.println(page1.asText());








    }
}
