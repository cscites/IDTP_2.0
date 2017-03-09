package com.company;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

/**
 * Created by chris on 3/8/17.
 */
public class Browser {
    private String url;
    private final WebClient BROWSER;


    public Browser(){

        BROWSER = new WebClient();
    }

    public void setUrl(String url){
        this.url = url;
    }

    public HtmlPage getPage() throws IOException {
        return BROWSER.getPage(url);

    }



}
