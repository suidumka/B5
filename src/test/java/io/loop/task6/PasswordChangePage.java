package io.loop.task6;

public class PasswordChangePage extends ProfilePage{


    @Override
    public void fillOutForm() {
        System.out.println("Filling out password change field");
    }

    @Override
    public void verifyUpdate() {
        System.out.println("Verifying password change");
    }
}
