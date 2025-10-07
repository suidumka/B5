package io.loop.task4;

public class Report extends SideMenuElement {
    public static void main(String[] args) {
        System.out.println("SideMenuElement.color = " + SideMenuElement.color);

        Report report1 = new Report();
        report1.name = "Summer report";
    }

    public String name; // variable can be duplicated, but it is not a good practice

}
