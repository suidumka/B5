package io.loop.task6;

public class PersonalInfoPage extends ProfilePage{


    @Override
    public void fillOutForm() {
        System.out.println("Filling out personal information");
    }

    @Override
    public void verifyUpdate() {
        System.out.println("Verifying personal information");
    }

    public static void saveChanges(){
        System.out.println("Saving changes");
    };

}
