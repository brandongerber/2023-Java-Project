import javax.swing.JOptionPane;

public class JavaV1 {
    private static int score;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Who Wants to Be a Java Programmer?", "Welcome", JOptionPane.PLAIN_MESSAGE);
        String name = JOptionPane.showInputDialog("Please enter your name:");

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Introduction", JOptionPane.PLAIN_MESSAGE);

        while (true) {
            Object[] options = {"See Rules", "Start Test", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Main Menu:", "Menu",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[2]);
           // added option to choice between options with an invalid choice if it was any number but 1/2/3
            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Rules of the test:\n" +
                            "1. You will be tested on a set of 5 multiple-choice questions relating to Java.\n" +
                            "2. These questions relate to chapters one, two, and three.\n" +
                            "3. Have fun!", "Rules", JOptionPane.INFORMATION_MESSAGE);
                    startTest(name);
                    break;
                case 1:
                    startTest(name);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Thank you for playing. Goodbye, " + name + "!",
                            "Goodbye", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please choose a valid option (1/2/3).",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // added a startest method 
    private static void startTest(String name) {
        score = 0;

        // Question 1
        String answer1 = JOptionPane.showInputDialog("Question 1: What does JVM stand for?\n" +
                "A) Java Virtual Machine\n" +
                "B) Java Very Main\n" +
                "C) Java Virtual Method\n" +
                "D) Java Viable Memory\n" +
                "Your answer (A/B/C/D): ").toUpperCase();
        // if user answers correctly they gain one point and it also shows their current score
        if (answer1.equals("A")) {
            score += 1; // Assigned a point value for Question 1
            JOptionPane.showMessageDialog(null, "Correct! You gained 1 point. Your current score: " + score, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is A. Your current score: " + score, "Result", JOptionPane.ERROR_MESSAGE);
        }

        // Question 2
        String answer2 = JOptionPane.showInputDialog("Question 2: What is the java source file extension?\n" +
                "A) .javaexe\n" +
                "B) .javas\n" +
                "C) .java\n" +
                "D) .exe\n" +
                "Your answer (A/B/C/D): ").toUpperCase();

        if (answer2.equals("C")) {
            score += 1; // Assigned a point value for Question 2
            JOptionPane.showMessageDialog(null, "Correct! You gained 1 point. Your current score: " + score, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is C. Your current score: " + score, "Result", JOptionPane.ERROR_MESSAGE);
        }

        // Question 3
        String answer3 = JOptionPane.showInputDialog("Question 3: What are comments used for?\n" +
                "A) To tell the compiler what it needs to do\n" +
                "B) To close a line of code\n" +
                "C) To keep reminders and notes\n" +
                "D) To define the scope of the class\n" +
                "Your answer (A/B/C/D): ").toUpperCase();

        if (answer3.equals("C")) {
            score += 1; // Assigned a point value for Question 3
            JOptionPane.showMessageDialog(null, "Correct! You gained 1 point. Your current score: " + score, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is C. Your current score: " + score, "Result", JOptionPane.ERROR_MESSAGE);
        }

        // added two more questions 
        String answer4 = JOptionPane.showInputDialog("Question 4: The else statement means what? \n" +
                "A) It means the boolean statement is true\n" +
                "B) That your code has an error\n" +
                "C) An alternative statement \n" +
                "D) You have more options to choose \n" +
                "Your answer (A/B/C/D): ").toUpperCase();

        if (answer4.equals("C")) {
            score += 1; // Assigned a point value for Question 4
            JOptionPane.showMessageDialog(null, "Correct! You gained 1 point. Your current score: " + score, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is C. Your current score: " + score, "Result", JOptionPane.ERROR_MESSAGE);
        }

        // Question 5
        String answer5 = JOptionPane.showInputDialog("Question 5: Which is an example of a Logical Operator? \n" +
                "A) !\n" +
                "B) >\n" +
                "C) ||\n" +
                "D) All of the above\n" +
                "Your answer (A/B/C/D): ").toUpperCase();

        if (answer5.equals("D")) {
            score += 1; // Assigned a point value for Question 5
            JOptionPane.showMessageDialog(null, "Correct! You gained 1 point. Your current score: " + score, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is D. Your current score: " + score, "Result", JOptionPane.ERROR_MESSAGE);
        }
        // added a total score at the end of the test
        JOptionPane.showMessageDialog(null, "Thank you for playing, " + name + "!\nYour total score is: " + score,
                "Test Results", JOptionPane.INFORMATION_MESSAGE);

        // Added a "Thank you for playing" message at the end of the test
        JOptionPane.showMessageDialog(null, "Thank you for playing, " + name + "!", "Test Completed", JOptionPane.PLAIN_MESSAGE);
    }
}