//Jeremy Part Prompt User for name
import java.util.Scanner;  // Import the Scanner class

 class UserPrompt {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name here: ");
        String name = scanner.nextLine();
        System.out1 .println("Hello " +name);
         System.out.println("You have chosen to see the rules. You will be given aset of 10 questions about Java. If you answer correctly, points will be added to your score. Have Fun! ");

    }
}