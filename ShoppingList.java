import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private static ArrayList<String> shoppingList = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println();
        System.out.println("Shopping List");
        System.out.println("This is currently unfinished!");

        while (running) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add an item");
            System.out.println("2. Resolve an item");
            System.out.println("3. Edit an item");
            System.out.println("5. Display all items");
            System.out.println("6. End program");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    coolConsoleTyping.coolType("Enter the item: ", false);
                    String newItem = scanner.nextLine();
                    shoppingList.add(newItem);
                    coolConsoleTyping.coolType("Added " + newItem + " to your shopping list", true);
                    coolConsoleTyping.customSleep(500);
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }


        }
    }




}
