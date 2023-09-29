// Display an Introduction to the Game.
//Display "Welcome to Who wants to be a Java programmer"

// Prompt the user for his/her name.
//Prompt "Please enter your name here: "
//Read users name

// Display the main menu.
//Display "Main Menu:"
//Display "1) See Rules"
//Display "2) Play Game"
//Display "3) Exit"

// Prompt the user for the main menu choice.
//Prompt "Enter your choice (1/2/3): "
//Read users choice

// Regardless of user input:
// Display the rules for the game in a message box.
//If users choice is 1:
    //Display "Game Rules:"
    //Display "1. Rule 1..."
    //Display "2. Rule 2..."
    //Display "3. Rule 3..."

// Display the 3 sets of questions and answers.
//Display "Set 1:"
//Display "Question 1: ..."
//Display "Option A: ..."
//Display "Option B: ..."
//Display "Option C: ..."
//Prompt "Your answer (A/B/C): "

import java.util.Scanner;

public class JavaV1 {
    private static int score;
	private static char userAnswer1;
	private static char userAnswer2;
	private static char userAnswer3;
	private static char userAnswer22;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        // show player the title
        System.out.println("Welcome to Who Wants to Be a Java Programmer?");
        // have player enter name
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
        // print main menu
        System.out.println("\nMain Menu:");
        System.out.println("1) See Rules");
        System.out.println("2) Start Test");
        System.out.println("3) Exit");
        System.out.print("Choose an option (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        //print rules of class and have player use enter key to enter test
        switch (choice) {
            case 1:
                System.out.println("\nRules of the test:");
                System.out.println("1. You will be tested on a set of 3 multiple-choice questions relating to Java.");
                System.out.println("2. These questions relate to chapters 1 and 2");
                System.out.println("3. Have fun!");
                System.out.println("\nPress Enter to start the test...");
                scanner.nextLine(); // Wait for Enter key
                startTest(scanner, name);
                break;
            case 2:
                startTest(scanner, name);
                break;
            case 3:
                System.out.println("Thank you for playing. Goodbye, " + name + "!");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option (1/2/3).");
        }

        scanner.close();
    }

    private static void startTest(Scanner scanner, String name) {
        score = 0;

        // Question 1
        System.out.println("\nQuestion 1: What does JVM stand for?");
        System.out.println("A)Java Virtual Machine");
        System.out.println("B)Java Very Main");
        System.out.println("C)Java Virtual Method");
        System.out.println("D)Java Viable Memory");
        System.out.print("Your answer (A/B/C/D): ");
        userAnswer1 = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();

        // Question 2
        System.out.println("\nQuestion 2:What is the java source file extension?");
        System.out.println("A).javaexe");
        System.out.println("B).javas");
        System.out.println("C).java");
        System.out.println("D).exe");
        System.out.print("Your answer (A/B/C/D): ");
        userAnswer22 = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();
        
        // Question 3
        System.out.println("\nQuestion 3: What are comments used for?");
        System.out.println("A)To tell the compiler what it needs to do");
        System.out.println("B)To close a line of code");
        System.out.println("C)To keep reminders and notes");
        System.out.println("D)To define the scope of the class");
        System.out.print("Your answer (A/B/C/D): ");
        userAnswer3 = scanner.next().toUpperCase().charAt(0);
        scanner.nextLine();

        System.out.println("\nThank you for playing, " + name + "!");
     
    }
}
