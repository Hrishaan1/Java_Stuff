import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        System.out.println("***** Find the Number Game *****");

        while (running) {
            System.out.println();
            System.out.println("I will pick a random number, between 0 and 100, and you have to guess the number.");
            System.out.println("Ready?");
            customSleep(500);
            System.out.print("Picking number");
            for (int i = 0; i < 4; i++) {
                customSleep(250);
                System.out.print(".");
            }
            System.out.println();
            System.out.println("Okay! I have the number!");
            int randomInt = random.nextInt(100);
            customSleep(500);
            System.out.print("Go ahead and guess! ");
            int playerGuess = scanner.nextInt();
            customSleep(500);
            
            coolConsoleTyping.coolType("Nice guess! Your guess was " + Math.abs(randomInt - playerGuess) + " off from the correct number.", running);
            coolConsoleTyping.coolType("The correct number was " + randomInt + ".", running);
            coolConsoleTyping.coolType("Would you like to try again? (answer with a yes or no)", running);
            scanner.nextLine();
            String continuePlaying = scanner.nextLine();

            if (continuePlaying.equalsIgnoreCase("yes")) {
                System.out.println("Okay! Lets try again.");
            } else if (continuePlaying.equalsIgnoreCase("no")) {
                System.out.println("Oh. Thats okay. We can play another time.");
                running = false;
            } else {
                System.out.println("I guess you meant yes. Well then lets try again!");
            }
            customSleep(750);

        }
        scanner.close();

    }


    public static void customSleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}