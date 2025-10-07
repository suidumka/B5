package io.loop.task6;

public interface Updatable {

    void fillOutForm();

    void verifyUpdate();

    static void saveChanges(){
        System.out.println("Saving changes");
    }
}
