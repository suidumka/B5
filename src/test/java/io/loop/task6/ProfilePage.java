package io.loop.task6;

public abstract class ProfilePage {

    public abstract void fillOutForm();

    public abstract void verifyUpdate();

    public static void saveChanges(){
        System.out.println("Saving changes");
    };


}
