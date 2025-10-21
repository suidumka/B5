package io.loop.task7.two;

public class Implementation {

 static StandardUser standardUser;
 static UserRights user;

    public static void main(String[] args) {
        standardUser = new StandardUser();
        user = new AdvancedUser();
        user = new StandardUser();




    }
}
