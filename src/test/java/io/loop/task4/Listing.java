package io.loop.task4;

public class Listing {
    private double price;
    public static String itemName = "Studying materials";
    private static String usernameAdmin = "admin";
    private static String password = "password123";


    public double getPrice() {
        return  price;
    }

    public void setPrice(double price, String username, String password) {
        if (username.equals(usernameAdmin) && password.equals(this.password)) {
            this.price = price;


        } else {
            System.out.println("Username and password do not match");
        }
    }
}
