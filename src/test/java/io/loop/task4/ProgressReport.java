package io.loop.task4;

public class ProgressReport extends Report{
    public static void main(String[] args) {
        System.out.println("color = " + color);
        ProgressReport progressReport1 = new ProgressReport();
        progressReport1.name = "Winter report";

        color = "Yellow";
        System.out.println("SideMenuElement.color = " + SideMenuElement.color);
        System.out.println("Report.color = " + Report.color);
        System.out.println("ProgressReport.color = " + ProgressReport.color);

        click("progress report button");

    }
}
