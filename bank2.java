import java.util.ArrayList;
import java.util.Scanner;


public class bank2 {
    
    public static ArrayList<String> bankAccName = new ArrayList<>();
    public static ArrayList<Double> bankAccBalance = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println();
        System.out.println("Welcome to the bank management software");

        while (running) {

            System.out.println();
            
            System.out.println("Menu: ");
            System.out.println("1. Open new account");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Display all accounts");
            System.out.println("5. Exit program");
            System.out.print("Pick an option: ");
            int choice = scanner.nextInt();



            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("What is the name for the account? ");
                    String accName = scanner.nextLine();
                    System.out.print("How much to put in the account? $");
                    double accAmt = scanner.nextDouble();
                    if (accAmt > 0) {
                        System.out.println("Created new account for " + accName + " with $" + accAmt + ". ");
                        bankAccName.add(accName);
                        bankAccBalance.add(accAmt);

                    } else {
                        System.out.println("Invalid balance. Please try again.");
                    }
                    customWait(1000);
                    break;
                case 2:
                    displayAllAcc();

                    System.out.print("Which account to deposit into? ");
                    int accDeposit = scanner.nextInt();
                    System.out.print("How much to deposit? $");
                    double amtToDep = scanner.nextDouble();
                    if (amtToDep > 0) {
                        bankAccBalance.set((accDeposit - 1), bankAccBalance.get(accDeposit - 1) + amtToDep);
                        System.out.println("Deposited $" + amtToDep + " into " + bankAccName.get(accDeposit - 1) + "'s account.");
                        System.out.println("New balance: " + bankAccBalance.get(accDeposit - 1));
                    } else {
                        System.out.println("Invalid deposit. Please try again.");
                    }
                    customWait(1000);
                    break;
                case 3:
                    displayAllAcc();
                    System.out.print("Which account to withdraw from? ");
                    int accWithdraw = scanner.nextInt();
                    System.out.print("How much to withdraw? $");
                    double amtToWithdraw = scanner.nextDouble();
                    if (amtToWithdraw > 0) {
                        bankAccBalance.set((accWithdraw - 1), bankAccBalance.get(accWithdraw - 1) - amtToWithdraw);
                        System.out.println("Withdrew $" + amtToWithdraw + " from " + bankAccName.get(accWithdraw - 1) + "'s account.");
                        System.out.println("New balance: " + bankAccBalance.get(accWithdraw - 1));
                    } else {
                        System.out.println("Invalid deposit. Please try again.");
                    }
                    customWait(1000);
                    break;
                case 4:
                    displayAllAcc();
                    customWait(1000);
                    break;
                case 5:
                    System.out.println("Stopping program.");
                    System.out.println("Thank you for using this bank management program.");
                    running = false;
                    break;
            }


            


        }
        scanner.close();
    }

    public static void displayAllAcc() {
        for (int i = 0; i < bankAccBalance.size(); i++) {
            System.out.println((i + 1) + ". Name: " + bankAccName.get(i) + ", Balance: $" + bankAccBalance.get(i));
        }
    }

    public static void customWait(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Thread interupted: " + e.getMessage());
        }
    }

}
