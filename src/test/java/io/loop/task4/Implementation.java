package io.loop.task4;

public class Implementation {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();

        shopping.itemName = "Iphone 17";
        System.out.println(shopping.itemName);

        shopping.setItemName("Iphone 16");

        System.out.println(shopping.itemName);

        System.out.println(shopping.getItemName());


        System.out.println(shopping.getPrice());

        shopping.setPrice(450);

        System.out.println(shopping.getPrice());

        Listing listing = new Listing();
        System.out.println(listing.getPrice());

        listing.setPrice(600, "admi", "pasword123");

        System.out.println("==============================================");

        listing.setPrice(600, "admin", "password123");

        System.out.println(listing.getPrice());

    }

}
