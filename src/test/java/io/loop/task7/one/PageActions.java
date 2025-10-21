package io.loop.task7.one;

public interface PageActions {

    public static final String TITLE = "TitleProfile";

    static void editField(){
        System.out.println("Static method");
    };

    default void chechStatus(){
        System.out.println("Status method");
    };

    void clickButton(String button);
}
