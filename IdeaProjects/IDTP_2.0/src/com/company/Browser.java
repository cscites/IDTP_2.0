package com.company;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

/**
 * Created by chris on 3/8/17.
 */
public class Browser {
    private final WebClient BROWSER;

    public Browser(){
        BROWSER = new WebClient();
    }


    public HtmlPage page(String url) throws IOException {
        return BROWSER.getPage(url);
    }


    public HtmlPage currentPage() throws IOException {
        return page(BROWSER.getCurrentWindow().getEnclosedPage().getUrl().toString());
    }

}
