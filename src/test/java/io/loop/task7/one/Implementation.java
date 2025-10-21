package io.loop.task7.one;

public class Implementation {
    public static void main(String[] args) {

        PageActions customerProfileEdit = new CustomerProfileEdit();
        CustomerProfileView customerProfileView = new CustomerProfileView();

        customerProfileView.clickButton("customerProfileEdit");
        customerProfileEdit.clickButton("customerProfile");

        System.out.println(CustomerProfileEdit.TITLE);
        System.out.println(CustomerProfileView.TITLE);

        customerProfileView.chechStatus();
        customerProfileEdit.chechStatus();

        PageActions.editField();
    }
}
