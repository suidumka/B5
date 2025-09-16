package io.loop.Task2;

import java.util.ArrayList;
import java.util.HashSet;

public class Implementation {
    public static void main(String[] args) {

        WebElementButton loginButton = new WebElementButton("loginBtn");
        WebElementButton backButton = new WebElementButton("\nbackBtn", "Back");
        WebElementButton logoutButton = new WebElementButton("\nlogoutBtn", "Logout");
        WebElementButton printButton = new WebElementButton("\nprintBtn", "Print");
        WebElementButton submmitButton = new WebElementButton("\nsubmitBtn");




        HashSet<WebElementButton> allButtons = new HashSet<>();
        allButtons.add(loginButton);
        allButtons.add(submmitButton);
        allButtons.add(backButton);
        allButtons.add(logoutButton);
        allButtons.add(printButton);
        allButtons.add(submmitButton);


        System.out.println(allButtons);


        System.out.println("======================================================");

        ArrayList<WebElementButton> allButtonsArr = new ArrayList<>();
        allButtonsArr.add(loginButton);
        allButtonsArr.add(submmitButton);
        allButtonsArr.add(backButton);
        allButtonsArr.add(logoutButton);
        allButtonsArr.add(printButton);
        allButtonsArr.add(submmitButton);

        System.out.println(allButtonsArr);

    }

}
