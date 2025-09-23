package io.loop.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import io.loop.task3.*;

public class Implementation extends  io.loop.task3.Bug{
    public static void main(String[] args) {


        System.out.println(io.loop.task3.Bug.projectName);

        Bug bug = new Bug("id#1", "desc1", "valid");
        Bug bug1 = new Bug("id#2", "desc2", "not valid");
        Bug bug3 = new Bug("id#3", "desc4", null);
        bug3.createdBy = "Suidum";

        List<Bug> bugList = new ArrayList<>();
        bugList.add(bug1);
        bugList.add(bug);
        bugList.add(bug3);
        System.out.println(bugList);
        //Collections.sort(bugList);





    }
}
