// Import necessary classes for input
import java.util.Scanner;

/**
 * ConsoleAdventureGame - A simple text-based adventure game played in the console.
 * Players make choices that lead them through different scenarios.
 */
public class ConsoleAdventureGame {

    // Scanner object to read user input from the console
    private static Scanner scanner = new Scanner(System.in);
    // Random object for random events (removed as it is unused)

    public static void main(String[] args) {
        // Display a welcome message and game title
        System.out.println("******************************************");
        System.out.println("* Welcome to the Mysterious Forest Adventure *");
        System.out.println("******************************************");
        System.out.println("\nYou awaken in a dense, silent forest.");
        System.out.println("A thick mist hangs in the air, obscuring your vision.");
        System.out.println("You have no memory of how you got here.\n");

        // Start the game by calling the initial scenario
        startJourney();

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    /**
     * startJourney()
     * This method initiates the first scenario of the game.
     */
    private static void startJourney() {
        System.out.println("You see two paths before you:");
        System.out.println("1. A narrow, winding path leading deeper into the mist.");
        System.out.println("2. A wider, less defined path that seems to go uphill.\n");
        System.out.print("Which path do you choose? (Enter 1 or 2): ");

        // Get user input and validate it
        int choice = getUserChoice(1, 2);

        // Based on the choice, proceed to the next scenario
        if (choice == 1) {
            pathOne();
        } else {
            pathTwo();
        }
    }

    /**
     * pathOne()
     * Scenario for choosing the narrow, winding path.
     */
    private static void pathOne() {
        System.out.println("\nYou venture down the narrow path, feeling the damp leaves beneath your feet.");
        System.out.println("The mist grows thicker, and you hear faint whispers.");
        System.out.println("Suddenly, you stumble upon a small, abandoned cabin.");
        System.out.println("Its door is ajar, and a strange light flickers within.\n");
        System.out.println("Do you:");
        System.out.println("1. Enter the cabin to investigate?");
        System.out.println("2. Ignore the cabin and try to find another way?");
        System.out.print("What do you do? (Enter 1 or 2): ");

        int choice = getUserChoice(1, 2);

        if (choice == 1) {
            enterCabin();
        } else {
            ignoreCabin();
        }
    }

    /**
     * pathTwo()
     * Scenario for choosing the wider, uphill path.
     */
    private static void pathTwo() {
        System.out.println("\nYou choose the wider path, climbing steadily uphill.");
        System.out.println("The mist begins to thin, and you catch glimpses of the sky.");
        System.out.println("After a long walk, you reach a clearing with an ancient, gnarled oak tree.");
        System.out.println("Beneath its roots, you notice a faint glow.\n");
        System.out.println("Do you:");
        System.out.println("1. Dig around the roots to find the source of the glow?");
        System.out.println("2. Rest under the tree and observe your surroundings?");
        System.out.print("What do you do? (Enter 1 or 2): ");

        int choice = getUserChoice(1, 2);

        if (choice == 1) {
            digRoots();
        } else {
            restUnderTree();
        }
    }

    /**
     * enterCabin()
     * Scenario for entering the cabin.
     */
    private static void enterCabin() {
        System.out.println("\nBraving the unknown, you push open the cabin door.");
        System.out.println("Inside, a single candle illuminates a dusty table with an old map.");
        System.out.println("The map seems to show a way out of the forest!\n");
        System.out.println("Do you:");
        System.out.println("1. Take the map and follow its instructions?");
        System.out.println("2. Look for more clues in the cabin?");
        System.out.print("What do you do? (Enter 1 or 2): ");

        int choice = getUserChoice(1, 2);

        if (choice == 1) {
            // This is a path to victory
            System.out.println("\nYou take the map and meticulously follow its ancient markings.");
            System.out.println("After hours of navigating the dense forest, the mist finally clears!");
            System.out.println("You see a familiar road in the distance. You've escaped!");
            endGame(true); // Game ends with victory
        } else {
            System.out.println("\nYou decide to search for more clues, but as you do, the ground beneath you crumbles!");
            System.out.println("You fall into a hidden pit, and the darkness consumes you.");
            endGame(false); // Game ends with defeat
        }
    }

    /**
     * ignoreCabin()
     * Scenario for ignoring the cabin.
     */
    private static void ignoreCabin() {
        System.out.println("\nYou decide the cabin is too risky and continue deeper into the mist.");
        System.out.println("The path eventually disappears, and you find yourself hopelessly lost.");
        System.out.println("The whispers grow louder, and you realize you're not alone.");
        System.out.println("A shadowy figure emerges from the fog...\n");
        endGame(false); // Game ends with defeat
    }

    /**
     * digRoots()
     * Scenario for digging around the tree roots.
     */
    private static void digRoots() {
        System.out.println("\nYou start digging around the roots, and soon unearth a small, ornate wooden box.");
        System.out.println("Inside, you find a single, glowing crystal. It feels warm to the touch.\n");
        System.out.println("Do you:");
        System.out.println("1. Keep the crystal and see what happens?");
        System.out.println("2. Leave the crystal and continue your journey?");
        System.out.print("What do you do? (Enter 1 or 2): ");

        int choice = getUserChoice(1, 2);

        if (choice == 1) {
            System.out.println("\nYou grasp the crystal, and its light intensifies, illuminating a clear path through the forest!");
            System.out.println("The mist parts before you, revealing a direct route out. You've found your way!");
            endGame(true); // Game ends with victory
        } else {
            System.out.println("\nYou leave the mysterious crystal behind, uncertain of its purpose.");
            System.out.println("You continue walking, but the forest seems endless. Eventually, you succumb to exhaustion and despair.");
            endGame(false); // Game ends with defeat
        }
    }

    /**
     * restUnderTree()
     * Scenario for resting under the tree.
     */
    private static void restUnderTree() {
        System.out.println("\nYou sit down under the ancient oak, taking a moment to rest and observe.");
        System.out.println("As you do, a wise old owl lands on a branch above you.");
        System.out.println("It hoots softly, then drops a shiny, old key at your feet.\n");
        System.out.println("Do you:");
        System.out.println("1. Pick up the key and look for a lock?");
        System.out.println("2. Ignore the key, thinking it's just a coincidence?");
        System.out.print("What do you do? (Enter 1 or 2): ");

        int choice = getUserChoice(1, 2);

        if (choice == 1) {
            System.out.println("\nYou pick up the key. Its intricate design suggests it's for something important.");
            System.out.println("Following a faint sound, you discover a hidden, ornate gate nearby.");
            System.out.println("The key fits! You open the gate and step out of the forest into a vibrant meadow!");
            endGame(true); // Game ends with victory
        } else {
            System.out.println("\nYou decide the key is not significant and continue to rest.");
            System.out.println("After a while, the owl flies away, and the mist rolls back in, trapping you.");
            endGame(false); // Game ends with defeat
        }
    }

    /**
     * getUserChoice(int min, int max)
     * Helper method to get and validate user input.
     * Ensures the input is an integer within the specified range.
     *
     * @param min The minimum valid choice (inclusive).
     * @param max The maximum valid choice (inclusive).
     * @return The validated integer choice from the user.
     */
    private static int getUserChoice(int min, int max) {
        int choice = -1;
        while (true) {
            try {
                String input = scanner.nextLine();
                choice = Integer.parseInt(input);
                if (choice >= min && choice <= max) {
                    break; // Valid input, exit loop
                } else {
                    System.out.print("Invalid choice. Please enter a number between " + min + " and " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return choice;
    }

    /**
     * endGame(boolean victory)
     * Displays the end game message based on whether the player won or lost.
     *
     * @param victory True if the player won, false if they lost.
     */
    private static void endGame(boolean victory) {
        System.out.println("\n******************************************");
        if (victory) {
            System.out.println("* Congratulations! You've escaped the forest! *");
            System.out.println("* You Win!                       *");
        } else {
            System.out.println("* Game Over.                       *");
            System.out.println("* You failed to escape the Mysterious Forest. *");
        }
        System.out.println("******************************************");
        System.out.println("Thank you for playing!");
    }
}
