package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chris.scites on 3/10/2017.
 */
public class Candidate {
    Browser browser = new Browser();
    Scanner scanner = new Scanner(System.in);

    private String webCV;

    public Candidate() throws IOException {
        setWebCV();
        browser.getCandidate(webCV);

    }

    public void setWebCV() {
        System.out.println("Enter Web CV #");
        this.webCV = scanner.nextLine();
    }
}
