package com.mycompany.exercicio07;

import classes.Customer;
import classes.Order;
import classes.OrderSys;
import classes.Product;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OrderSys manager = new OrderSys();

          System.out.print("How many orders do you want to add? ");
        int numberOfOrders = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberOfOrders; i++) {
            System.out.println("\n--- Order " + (i + 1) + " ---");
            Customer customer = new Customer();
            customer.fill(input);

            Order order = new Order(customer);

            for (int j = 0; j < 2; j++) {
                Product product = new Product();
                product.fill(input);
                input.nextLine();
                order.addProduct(product);
            }

            manager.addOrder(order);
        }


        System.out.println("\n=== Summary ===");
        System.out.println("Total Revenue: $" + manager.totalRevenue());
        System.out.println("Most Sold Product: " + manager.mostSoldProduct());
        System.out.println("Least Sold Product: " + manager.leastSoldProduct());
        System.out.println("Client with Most Orders: " + manager.clientWithMostOrders());
        System.out.println("Client Who Spent Most: " + manager.clientWhoSpentMost());

        input.close();
    }
}
