package io.loop.task7.one;

public class CustomerProfileEdit implements PageActions{

    public String fieldName = "FieldName";

    public void uploadFile(String fieldName){
        System.out.println("Upload file");
    };

    @Override
    public void clickButton(String button) {

    }


}
