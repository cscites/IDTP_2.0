package com.company;

import com.gargoylesoftware.htmlunit.WebClient;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static final WebClient PLINK = new WebClient();


    public static void main(String[] args) throws IOException, URISyntaxException {
        //Login myLogin = new Login();

        Login2 newLogin = new Login2();
        //Candidate newCandidate = new Candidate();
    }
}
