package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chris.scites on 3/10/2017.
 */
public class Login {
    Browser browser = new Browser();
    Scanner scanner = new Scanner(System.in);

    private String username;
    private String password;

    public Login() throws IOException {
        setUsername();
        setPassword();
        browser.login(username, password);


    }

    public void setUsername(){
        System.out.println("Enter your username.");
        username = scanner.nextLine();
    }

    public  void setPassword(){
        System.out.println("Enter your password.");
        password = scanner.nextLine();
    }
}
