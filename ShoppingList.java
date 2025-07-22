import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private static ArrayList<String> shoppingList = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println();
        System.out.println("Shopping List");
        
        while (running) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add an item");
            System.out.println("2. Resolve an item");
            System.out.println("3. Edit an item");
            System.out.println("4. Display all items");
            System.out.println("5. End program");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    coolConsoleTyping.coolType("Enter the item: ", false);
                    String newItem = scanner.nextLine();
                    shoppingList.add(newItem);
                    coolConsoleTyping.coolType("Added '" + newItem + "' to your shopping list", true);
                    coolConsoleTyping.customSleep(500);
                    break;
                case 2:
                    printAllItems();
                    coolConsoleTyping.coolType("Which item to resolve? ", false);
                    int resolveChoice = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (resolveChoice > 0 && resolveChoice <= shoppingList.size()) {
                        coolConsoleTyping.coolType("Resolved item '" + shoppingList.get(resolveChoice - 1) + "'.", true);
                        shoppingList.remove(resolveChoice - 1);
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                case 3: 
                    printAllItems();
                    coolConsoleTyping.coolType("Which item would you like to edit? ", false);
                    int editChoice = scanner.nextInt();
                    scanner.nextLine();
                    String previousShoppingList = null;
                    if (editChoice > 0 && editChoice <= shoppingList.size()) {
                        coolConsoleTyping.coolType("What would you like to edit '" + shoppingList.get(editChoice - 1) + "' to? ", false);
                        previousShoppingList = shoppingList.get(editChoice - 1);
                        String editString = scanner.nextLine();
                        shoppingList.set(editChoice - 1, editString);
                        coolConsoleTyping.coolType("Edited '" + previousShoppingList + "' to '" + editString + "'.", true);
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                case 4:
                    printAllItems();
                    coolConsoleTyping.customSleep(1000);
                    break;
                case 5:
                    scanner.close();
                    running = false;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            

        }
        coolConsoleTyping.coolType("Program has been ended. Goodbye!", true);
    }

    private static void printAllItems() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }




}
