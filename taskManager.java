import java.util.ArrayList;
import java.util.Scanner;


public class taskManager {
    public static ArrayList<String> toDoList = new ArrayList<String>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String resolveString = "No task resolved"; 

        System.out.println();
        System.out.println("Welcome to the Task Manager");

        while (running) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add new task");
            System.out.println("2. Resolve Task");
            System.out.println("3. Edit Task");
            System.out.println("4. Display all tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consumes newline

            switch (choice)  {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Added '" + task + "' to the to-do list.");
                    programSleep(1000);
                    break;
                case 2:
                    System.out.println("Which task to resolve? ");
                    printAllTasks();
                    int resolve = scanner.nextInt();
                    scanner.nextLine(); // consumes newline
                    if (resolve > 0 && resolve <= toDoList.size()) {
                        resolveString = toDoList.get(resolve - 1);
                        toDoList.remove(resolve - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    System.out.println("Resolved task: " + resolveString);
                    break;
                case 3:
                    printAllTasks();
                    System.out.print("Which item would you like to edit? ");
                    int editItem = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("What would you like to change it to? ");
                    String itemEdited = scanner.nextLine();

                    if (editItem > 0 && editItem <= toDoList.size()) {
                        toDoList.set((editItem - 1), itemEdited);
                        System.out.println("Changed task " + editItem + " to " + itemEdited);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    printAllTasks();
                    programSleep(1000);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default: 
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }

        scanner.close();
        System.out.println("Scanner closed. Goodbye!");



    }

    public static void printAllTasks() {

        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + toDoList.get(i));
        }
    }

    public static void programSleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }



}
