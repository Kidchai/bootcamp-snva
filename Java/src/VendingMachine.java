/* You are building a program to simulate a vending machine that dispenses drinks
based on the user's selection and the amount of money they insert. Write a Java program that
allows the user to enter the amount of money they have and the number corresponding to the drink
they want to purchase. The program should then dispense the drink if the user has enough money
and display an appropriate message if they do not. Assume that the vending machine has the following
drinks and prices: Coke: $1.50 Pepsi: $1.75 Sprite: $1.25
 */

import java.util.Locale;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        double cokePrice = 1.50;
        double pepsiPrice = 1.75;
        double spritePrice = 1.25;

        System.out.println("Welcome to the vending machine!");

        System.out.println("Please insert your money");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double money = scanner.nextDouble();

        System.out.println("Please select your drink");
        int drink = scanner.nextInt();

        String message = switch (drink) {
            case 1 -> money >= cokePrice ? "Enjoy your Coke!" : "Sorry, you don't have enough money for a Coke.";
            case 2 -> money >= pepsiPrice ? "Enjoy your Pepsi!" : "Sorry, you don't have enough money for a Pepsi.";
            case 3 -> money >= spritePrice ? "Enjoy your Sprite!" : "Sorry, you don't have enough money for a Sprite.";
            default -> "Sorry, we don't have that drink!";
        };
        System.out.println(message);
    }
}
