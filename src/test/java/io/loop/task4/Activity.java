package io.loop.task4;

public class Activity extends SideMenuElement {
    public static void  click (String button){
        System.out.println("Duble click" + button);
    }
    public static void click (String button){


        System.out.println("Double click " + button);

    }
@Override
    public void loadPage(String page){
        click("Activity" + page);
        System.out.println("Loading page " + page);
    }

    public static void main(String[] args) {
        click("Activity");

        click("activity button");
        click("activity");
    }

}
