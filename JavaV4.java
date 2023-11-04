
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JavaV4 {
    private static int score;
    private static int highScore;


    public static void main(String[] args) {
        createHighScoreFile();
        loadHighScore();


        JOptionPane.showMessageDialog(null, "Welcome to Who Wants to Be a Java Programmer?", "Welcome", JOptionPane.PLAIN_MESSAGE);
        String name = JOptionPane.showInputDialog("Please enter your name:");

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Introduction", JOptionPane.PLAIN_MESSAGE);

        boolean playAgain;
        do {
            playAgain = false;

            Object[] options = {"See Rules", "Start Test", "Exit"};
            int choice;
            do {
                choice = JOptionPane.showOptionDialog(null, "Main Menu:", "Menu",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[2]);
            } while (choice < 0 || choice > 2);

            switch (choice) {
                case 0:
                    showRules();
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

            String playAgainChoice = JOptionPane.showInputDialog("Do you want to play again? (yes/no)").toLowerCase();
            if (playAgainChoice.equals("yes")) {
                playAgain = true;
            }
            if (score > highScore) {
                highScore = score;
                updateHighScore();
                JOptionPane.showMessageDialog(null, "Congratulations, you've set a new high score! Your score: " + score, "High Score", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thank you for playing. Your score: " + score + "\nHigh score: " + highScore, "Test Results", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (playAgain);
    }
    private static void createHighScoreFile() {
        try {
            FileWriter writer = new FileWriter("highscore.txt");
            writer.write("0");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startTest(String name) {
        score = 0;

        ArrayList<QuestionData> questions = readQuestionsFromFile("questions.txt");

        for (QuestionData questionData : questions) {
            askQuestion(questionData, name);
        }

        // Display the total score
        JOptionPane.showMessageDialog(null, "Thank you for playing, " + name + "!\nYour total score is: " + score, "Test Results", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void askQuestion(QuestionData questionData, String name) {
        String userAnswer;
        do {
            StringBuilder optionsStr = new StringBuilder();
            for (int i = 0; i < questionData.options.length; i++) {
                optionsStr.append(questionData.options[i]).append("\n");
            }
            userAnswer = JOptionPane.showInputDialog(questionData.question + "\n" + optionsStr + "Your answer (A/B/C/D): ").toUpperCase();
        } while (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C") && !userAnswer.equals("D"));

        if (userAnswer.equals(questionData.correctAnswer)) {
            score += 10;
            JOptionPane.showMessageDialog(null, "Correct! You gained 10 points. Your current score: " + score, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + questionData.correctAnswer + ". Your current score: " + score, "Result", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static ArrayList<QuestionData> readQuestionsFromFile(String filename) {
        ArrayList<QuestionData> questions = new ArrayList<>();
        QuestionData currentQuestion = null;
    
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#")) {
                    if (currentQuestion != null) {
                        questions.add(currentQuestion);
                    }
                    currentQuestion = new QuestionData(line.substring(1));
                } else if (currentQuestion != null) {
                    // Check if the line is a correct answer (A, B, C, D)
                    if (line.trim().matches("[A-Da-d]")) {
                        currentQuestion.correctAnswer = line.toUpperCase();
                    } else {
                        currentQuestion.addOption(line);
                    }
                }
            }
            if (currentQuestion != null) {
                questions.add(currentQuestion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return questions;
    }
    
    private static void loadHighScore() {
        try (BufferedReader reader = new BufferedReader(new FileReader("highscore.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                highScore = Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateHighScore() {
        try (FileWriter writer = new FileWriter("highscore.txt")) {
            writer.write(Integer.toString(highScore));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class QuestionData {
        String question;
        String[] options = new String[4];
        String correctAnswer;
        int pointValue;

        public QuestionData(String question) {
            this.question = question;
        }

        public void addOption(String option) {
            for (int i = 0; i < options.length; i++) {
                if (options[i] == null) {
                    options[i] = option;
                    break;
                }
            }
        }
    }

    private static void showRules() {
        JOptionPane.showMessageDialog(null, "Rules of the test:\n" +
                "1. You will be tested on a set of multiple-choice questions.\n" +
                "2. Have fun!", "Rules", JOptionPane.INFORMATION_MESSAGE);
    }
}

