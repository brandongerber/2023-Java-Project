import java.util.Scanner;

public class JavaV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Welcome to Who Wants to Be a Java Programmer? Press Enter to begin!");
        String playerName = scanner.nextLine();
        System.out.println("Please enter your name here: ");
        String name = scanner.nextLine();
        System.out .println("Hello " +name);
        // Display the main menu
        System.out.println("Main Menu:");
        System.out.println("1) See Rules");
        System.out.println("2) Play Game");
        System.out.println("3) Exit");

        // Prompt the user to choose an option
        System.out.print("Choose an option (1/2/3): ");
        int choice = scanner.nextInt();

        // Handle user's choice
        switch (choice) {
            case 1:
                // Display rules
                System.out.println("1. You will be tested on a set of 10 questions relating to Java.");
                System.out.println("2. After each question, you will receive points for each correct answer.");
                System.out.println("3. At the end of the test, you will receive a final score.");
                break;
            case 2:
                // Exit the game
                System.out.println("Thank you for playing. Goodbye, " + playerName + "!");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option (1/2/3).");
        }

        // Close the scanner
        scanner.close();
    }
}