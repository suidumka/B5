package io.loop.task4;

public class ProgressReport extends Report {

    public static void main(String[] args) {
        System.out.println(color);

        ProgressReport prog1 = new ProgressReport();
        prog1.name = "Winter report";

        System.out.println(prog1.name);

        color = "Yellow";
        System.out.println(SideMenuElement.color);
        System.out.println(Report.color);
        System.out.println(ProgressReport.color);

        click("progress report button");



    }

}
