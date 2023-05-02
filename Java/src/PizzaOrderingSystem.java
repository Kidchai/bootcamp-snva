import java.util.Scanner;

public class PizzaOrderingSystem {
    static Scanner scanner = new Scanner(System.in);
    static String ingredientsList = "";

    public static void main(String[] args) {
        System.out.println("Welcome to the pizza ordering system!");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your address:");
        String address = scanner.nextLine();

        double price = calculateOrder();

        printOrderDetails(name, address, price);
    }

    public static double calculateOrder() {
        double price = 0;

        System.out.println("Select your pizza size (enter from 1 to 3):");
        System.out.println("""
                1. Small $10
                2. Medium $12
                3. Large $14""");
        int pizzaSize = scanner.nextInt();

        price = switch (pizzaSize) {
            case 1 -> 10;
            case 2 -> 12;
            case 3 -> 14;
            default -> 0;
        };

        System.out.println("Select your pizza toppings (enter from 1 to 3 and 'done' when finished):");
        System.out.println("""
                1. Pepperoni $1
                2. Mushrooms $3
                3. Sausage $4
                """);
        String topping = "";
        StringBuilder ingredients = new StringBuilder("");
        do {
            topping = scanner.next();
            switch (topping) {
                case "1" -> {
                    price += 1;
                    ingredients.append("pepperoni, ");
                }
                case "2" -> {
                    price += 3;
                    ingredients.append("mushrooms, ");
                }
                case "3" -> {
                    price += 4;
                    ingredients.append("sausage, ");
                }
                default -> price += 0;
            }
        } while (!topping.equals("done"));
        ingredients.delete(ingredients.length() - 2, ingredients.length());
        ingredientsList = ingredients.toString();
        return price;
    }

    private static void printOrderDetails(String name, String address, double price) {
        System.out.printf("%s, thank you for your order!%n", name);
        System.out.printf("Your pizza with %s will be delivered to %s%n", ingredientsList, address);
        System.out.printf("Your order will cost $%.2f", price);
    }
}
