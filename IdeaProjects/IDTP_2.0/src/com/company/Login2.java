package com.company;




import com.gargoylesoftware.htmlunit.WebClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.apache.http.util.EntityUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.swing.text.html.parser.Entity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.net.*;
import java.security.cert.Certificate;
import java.util.*;

/**
 * Created by chris.scites on 3/7/2017.
 */
public class Login2 {
    private String email;
    private String password;


    URL loginURL = new URL("https://admin.practicelink.com/MyAccount/Login.aspx?urlPath=https://admin.practicelink.com/default.aspx");
    Scanner scanner = new Scanner(System.in);
    public Login2() throws IOException, URISyntaxException {
        //setEmail();
        //setPassword();

        HttpURLConnection login2 = new HttpURLConnection(loginURL) {
            @Override
            public void disconnect() {

            }

            @Override
            public boolean usingProxy() {
                return false;
            }

            @Override
            public void connect() throws IOException {

            }
        };

        HttpGet login = new HttpGet(loginURL.toString());
        System.out.println(login.getMethod());
        System.out.println(login.getRequestLine().toString());
        System.out.println(login.getURI().toString());
        System.out.println(login.getParams().toString());
        System.out.println(login.getClass().toString());

        System.out.println(login2.getRequestMethod());
        System.out.println(loginURL.getContent().toString());
        System.out.println(loginURL.openConnection().getContentType());
        System.out.println(loginURL.openConnection().getDoInput());










        /**
        Map<String,Object> params = new LinkedHashMap<>();
        params.put("email", email);
        params.put("password", password);


        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,Object> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection)loginURL.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length",String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

        for (int c; (c = in.read()) >= 0;)
            System.out.print((char)c);

*/



/**
        WebDriver driver = new HtmlUnitDriver();

        driver.get(loginURL.toString());
        WebElement emailInput = driver.findElement(By.name("ctl00$ContentBody$Login1$PwdPassword"));
        WebElement pwInput = driver.findElement(By.name("ctl00$ContentBody$Login1$PwdPassword"));
        WebElement submitButton = driver.findElement(By.name("ctl00$ContentBody$Login1$BtnLogIn"));
        WebElement stayLoggedIn = driver.findElement(By.name("ctl00$ContentBody$Login1$CbRememberMe"));
        emailInput.sendKeys(email);
        System.out.println(emailInput.getTagName());
        pwInput.sendKeys(password);
        stayLoggedIn.isSelected();
        submitButton.click();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
*/


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
