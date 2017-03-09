package com.company;


import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Browser browser = new Browser();
        System.out.println("Enter a URL");
        browser.setUrl(scanner.nextLine());


        HtmlPage page = browser.getPage();

        String asText = page.asText();


        System.out.println(asText);



    }
}
