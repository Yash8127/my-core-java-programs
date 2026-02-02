package com.DailyTask;
import java.util.Scanner;

public class Book {
    int bookId;
    String title;
    String author;
    double price;
    double discountPercentage;
    double discountAmount;

    void displayBookDetails() {
        System.out.println("\n--- BOOK DETAILS ---");
        System.out.println("Book ID = " + bookId);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println("Discount Percentage = " + (discountPercentage * 100) + "%");
        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Final Price = " + (price - discountAmount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.println("Enter Book ID: ");
        b.bookId = sc.nextInt();
        sc.nextLine(); // to consume newline

        System.out.print("Enter Book Title: ");
        b.title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        b.author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        b.price = sc.nextDouble();

        System.out.print("Enter Discount Percentage (e.g., 0.1 for 10%): ");
        b.discountPercentage = sc.nextDouble();

        // Calculate discount amount
        b.discountAmount = b.price * b.discountPercentage;

        // Display details
        b.displayBookDetails();

        sc.close();
    }
}
