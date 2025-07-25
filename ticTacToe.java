import java.util.Scanner;

public class ticTacToe {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ticTacToeBoard = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
        char[] topRow = {ticTacToeBoard[0], ticTacToeBoard[1], ticTacToeBoard[2]};
        char[] middleRow = {ticTacToeBoard[3], ticTacToeBoard[4], ticTacToeBoard[5]};
        char[] bottomRow = {ticTacToeBoard[6], ticTacToeBoard[7], ticTacToeBoard[8]};

        System.out.println("Get a friend to play Tic Tac Toe!");
        System.out.print("Type 'ready' when you are ready. ");
        String readyString = scanner.nextLine();
        boolean running;
        if (readyString.equals("ready")) {
            running = true;
        } else {
            running = true;
        }

        while (running) {
            System.out.println();
            System.out.println();
            System.out.println("1 | 2 | 3");
            System.out.println("---------");
            System.out.println("4 | 5 | 6");
            System.out.println("---------");
            System.out.println("7 | 8 | 9");

            System.out.println();
            System.out.print("Type the number for X to be placed at. ");
            int xChoice = scanner.nextInt();


            if (xChoice <= 3) {
                if (checkForAlrdyFilled(xChoice - 1, ticTacToeBoard)) {
                    ticTacToeBoard[xChoice - 1] = 'X';   
                }
            } else if (xChoice >= 4 && xChoice <= 6) {
                if (checkForAlrdyFilled(xChoice, ticTacToeBoard)) {
                    ticTacToeBoard[xChoice - 1] = 'X';
                }
            } else if(xChoice >= 7 && xChoice <= 9) {
                if (checkForAlrdyFilled(xChoice, topRow, middleRow, bottomRow)) {
                    ticTacToeBoard[xChoice - 1] = 'X';
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }

            System.out.println(topRow[0] + " | " + topRow[1] + " | " + topRow[2]);
            System.out.println("---------");
            System.out.println(middleRow[0] + " | " + middleRow[1] + " | " + middleRow[2]);
            System.out.println("---------");
            System.out.println(bottomRow[0] + " | " + bottomRow[1] + " | " + bottomRow[2]);

            System.out.println();
            System.out.print("Type the number for O to be placed at. ");
            int oChoice = scanner.nextInt();

            
            if (oChoice <= 3) {
                if (checkForAlrdyFilled(oChoice, topRow, middleRow, bottomRow)) {
                    ticTacToeBoard[oChoice - 1] = 'X';
                }
            } else if (oChoice >= 4 && oChoice <= 6) {
                if (checkForAlrdyFilled(oChoice, topRow, middleRow, bottomRow)) {
                    ticTacToeBoard[oChoice - 1] = 'X';
                }
            } else if(oChoice >= 7 && oChoice <= 9) {
                if (checkForAlrdyFilled(oChoice, topRow, middleRow, bottomRow)) {
                    ticTacToeBoard[oChoice - 1] = 'X';
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    public static boolean checkForAlrdyFilled(int position, char[] topRow, char[] middleRow, char[] bottomRow) {
        if (position <= 3 && position >= 1) {
            return topRow[position - 1] != '-';
        } else if (position >= 4 && position <= 6) {
            return middleRow[position - 4] != '-';
        } else if (position >= 7 && position <= 9) {
            return bottomRow[position - 7] != '-';
        } else {
            return false; // Invalid position
        }
    }

    // Overloaded method for single row
    public static boolean checkForAlrdyFilled(int position, char[] row) {
        if (position >= 0 && position < row.length) {
            return row[position] != '-';
        } else {
            return false; // Invalid position
        }
    }



}
