package io.loop.task4;

public class SideMenuElement {

    public static String color = "Grey";
    public String name;
    public static void click (String button){
        System.out.println("Click on " + button);

    public void loadPage(String page) {
        System.out.println("Loading page = " + page);
    }

    public static void  click (String button){
        System.out.println("Click on" + button);
    }
    }
    public void loadPage(String page){
        System.out.println("Loading page " + page);
    }

    public static void main(String[] args) {
        System.out.println(color);
        click("SideMenuElement");
        System.out.println("color = " + color);
        click("side menu element");
    }
}

