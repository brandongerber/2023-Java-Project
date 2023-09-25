package Yes;

import java.util.Scanner;

public class GamesRules {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please choose from the following menu:");
        System.out.println("1) See Rules");
        System.out.println("2) Play Game");
        System.out.println("3) Exit");

        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                displayRules();
                break;
            case 2:
                displayQuestions();
                break;
            case 3:
                System.out.println("Thanks for playing! Have a nice day!");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
        }
        
        scanner.close();
    }

    public static void displayRules() {
        System.out.println("You have chosen to see the rules. " +
                "You will be given a set of 10 questions about Java. " +
                "If you answer correctly, points will be added to your score. Have fun!");
    }

    public static void displayQuestions() {
        System.out.println("You have chosen to play the game.");
        // Implement your game logic here.
    }
}
