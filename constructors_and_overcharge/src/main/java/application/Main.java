package main.java.application;

import java.util.Locale;
import java.util.Scanner;

import main.java.entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Scanning stuff
        System.out.println("Enter product data in the following requests.");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        product.setName("Computer");

        System.out.println(product.toString());
    }
}