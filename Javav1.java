import javax.swing.JOptionPane;

public class Javav1 {
    private static int score;
    private static char userAnswer1;
    private static char userAnswer2;
    private static char userAnswer3;

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Welcome to Who Wants to Be a Java Programmer?\nPlease enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        String[] options = {"See Rules", "Start Test", "Exit"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Main Menu:",
                "Java Quiz",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        switch (choice) {
            case 0:
                showRules(name);
                break;
            case 1:
                startTest(name);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Thank you for playing. Goodbye, " + name + "!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice. Please choose a valid option (1/2/3).");
        }
    }

    private static void showRules(String name) {
        JOptionPane.showMessageDialog(
                null,
                "Rules of the test:\n" +
                        "1. You will be tested on a set of 3 multiple-choice questions relating to Java.\n" +
                        "2. These questions relate to chapters 1 and 2\n" +
                        "3. Have fun!\n" +
                        "\nPress OK to start the test...",
                "Rules",
                JOptionPane.INFORMATION_MESSAGE);
        startTest(name);
    }

    private static void startTest(String name) {
        score = 0;

        // Question 1
        String answer1 = JOptionPane.showInputDialog(
                null,
                "Question 1: What does JVM stand for?\n" +
                        "A) Java Virtual Machine\n" +
                        "B) Java Very Main\n" +
                        "C) Java Virtual Method\n" +
                        "D) Java Viable Memory\n" +
                        "Your answer (A/B/C/D): ");
        userAnswer1 = answer1.toUpperCase().charAt(0);

        // Question 2
        String answer2 = JOptionPane.showInputDialog(
                null,
                "Question 2: What is the java source file extension?\n" +
                        "A) .javaexe\n" +
                        "B) .javas\n" +
                        "C) .java\n" +
                        "D) .exe\n" +
                        "Your answer (A/B/C/D): ");
        userAnswer2 = answer2.toUpperCase().charAt(0);

        // Question 3
        String answer3 = JOptionPane.showInputDialog(
                null,
                "Question 3: What are comments used for?\n" +
                        "A) To tell the compiler what it needs to do\n" +
                        "B) To close a line of code\n" +
                        "C) To keep reminders and notes\n" +
                        "D) To define the scope of the class\n" +
                        "Your answer (A/B/C/D): ");
        userAnswer3 = answer3.toUpperCase().charAt(0);

        JOptionPane.showMessageDialog(
                null,
                "Thank you for playing, " + name + "!\nYour score: " + calculateScore(),
                "Java Quiz",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static int calculateScore() {
        int correctAnswers = 0;
        if (userAnswer1 == 'A') correctAnswers++;
        if (userAnswer2 == 'C') correctAnswers++;
        if (userAnswer3 == 'C') correctAnswers++;
        return correctAnswers;
    }
}