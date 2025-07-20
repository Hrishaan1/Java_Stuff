import java.util.Scanner;

public class calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.println();
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Select operation: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter the first number that you want to add. ");
                    double firstNum = scanner.nextDouble();
                    System.out.print("Enter the second number that you want to add. ");
                    double secondNum = scanner.nextDouble();

                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum) + ".");
                    break;
                case 2:
                    System.out.print("Enter the number that you want to subtract from. ");
                    double firstNumSub = scanner.nextDouble();
                    System.out.print("Enter the number that you want to subtract by. ");
                    double secNumSub = scanner.nextDouble();

                    System.out.println(firstNumSub + " - " + secNumSub + " = " + (firstNumSub - secNumSub) + ".");
                    break;
                case 3:
                    System.out.print("Enter the number that you want to multiply. ");
                    double firstNumX = scanner.nextDouble();
                    System.out.print("Enter the number that you want to multiply ");
                    double secNumX = scanner.nextDouble();

                    System.out.println(firstNumX + " x " + secNumX + " = " + (firstNumX * secNumX) + ".");
                    break;
                case 4:
                    System.out.print("Enter the number that you want to divide. ");
                    double firstNumDiv = scanner.nextDouble();
                    System.out.print("Enter the number that you want to divide by. ");
                    double secNumDiv = scanner.nextDouble();

                    System.out.println(firstNumDiv + " / " + secNumDiv + " = " + (firstNumDiv / secNumDiv) + ".");
                    break;
            }
        }
    }
}
