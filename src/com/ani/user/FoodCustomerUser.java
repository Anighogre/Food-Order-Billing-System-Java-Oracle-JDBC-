package com.ani.user;

import java.util.Scanner;
import com.ani.foodBean.Customer;
import com.ani.service.FoodCustomerService;

public class FoodCustomerUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodCustomerService service = new FoodCustomerService();
        Customer cus = null;
        boolean isFirst = false; // ✅ keep track for current session

        while (true) {
            System.out.println("\n🧪 Sample Execution Flow:");
            System.out.println("1. Place an order");
            System.out.println("2. Print the bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Order ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Customer Name: ");
                    String c_name = sc.nextLine();
                    System.out.print("Enter Food Item: ");
                    String f_item = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Price per Item: ");
                    double price_per_item = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Phone Number: ");
                    String phNo = sc.nextLine();

                    cus = new Customer(id, c_name, f_item, quantity, price_per_item, phNo);

                    // ✅ check before inserting (store this result)
                    isFirst = service.isFirstCustomer(cus);

                    int result = service.addCustomer(cus);
                    if (result == 1) {
                        System.out.println("Order added successfully.");
                        if (isFirst) {
                            System.out.println("[50% discount applied for first-time user]");
                        }
                    } else {
                        System.err.println("Order not added!");
                    }
                }

                case 2 -> {
                    if (cus == null) {
                        System.err.println("No order found! Please place an order first.");
                        break;
                    }

                    // ✅ use stored value instead of checking DB again
                    service.printBill(cus, isFirst);
                }

                case 3 -> {
                    System.out.println("Thank you for visiting!!!");
                    System.exit(0);
                }

                default -> System.err.println("Invalid choice! Please try again.");
            }
        }
    }
}
