package io.loop.task7.one;

public class CustomerProfileView implements PageActions{

    public String iconName = "Icon Name";

    public void downloadFile(String fieldName){
        System.out.println("Download file");
    };

    @Override
    public void clickButton(String button) {

    }
}
