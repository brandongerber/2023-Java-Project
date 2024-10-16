Description:
"Who Wants to Be a Java Programmer?" is a Java-based multiple-choice quiz game designed to test knowledge of Java programming concepts. The game features 10 questions, each with four answer choices, and tracks the user's score. High scores are stored and compared with the user's performance, and the game offers options to view rules, take the test, or exit the program.

Features:
Main Menu:

View the rules of the game.
Start the test.
Exit the game.
Quiz Questions:

The game reads 10 Java-related multiple-choice questions from a file.
Each question has four answer options (A, B, C, D).
Players can answer the questions, and their score is updated based on correct answers.
High Score Management:

The game tracks high scores and compares them with the user's performance.
If the user achieves a new high score, they can input their name, and the high score table is updated.
High scores are saved in a text file (highscore.txt).
Error Handling:

If the question file is not found or cannot be read, the game displays an error message and gracefully exits the quiz.
User Interaction:

The game uses JOptionPane for graphical dialog boxes to display menus, questions, and results.
How to Run the Program:
Prerequisites:

You need a Java Development Kit (JDK) installed on your system.
Create a file called questions.txt in the src directory that contains the quiz questions and answers in the following format:
less
Copy code
#1 What is the size of an int in Java?
A) 8 bits
B) 16 bits
C) 32 bits
D) 64 bits
C
Compiling and Running:

To compile: javac JavaV6.java
To run: java JavaV6
Instructions:

Upon running the program, a welcome message will appear, and you will be asked to enter your name.
You will then see the main menu, where you can view the rules, start the quiz, or exit the game.
During the quiz, answer each question by entering "A", "B", "C", or "D".
After completing the quiz, your final score will be displayed. If your score is higher than the current high scores, you'll be prompted to input your name and your score will be saved.
The game will ask if you'd like to play again after each round.
Files:
JavaV6.java: The main Java file that contains all the logic for the game.
questions.txt: A text file that stores the questions, answer options, and correct answers.
highscore.txt: A file used to store the top 3 high scores along with player names. It is automatically created if it doesn’t exist.
Methods:
main():

Initializes the game, displays the welcome message, and loops through the main menu until the player chooses to exit.
displayMainMenu():

Displays the main menu and prompts the user to select an option.
displayRules():

Shows the rules of the quiz to the player.
startTest():

Initializes the score to 0 and reads the questions from questions.txt. It processes each question and updates the score accordingly.
processQuestion():

Displays each question with options, accepts the user's answer, checks if it is correct, and updates the score.
readInHighScore():

Reads the high scores from highscore.txt and stores them in arrays for comparison.
compareScore():

Compares the player's score with the high scores and updates the high score list if necessary.
updateHighScoreFile():

Writes the updated high scores to highscore.txt.
createHighScoreFile():

Creates a new highscore.txt file if it doesn't already exist.
readQuestion():

Reads the quiz questions and answers from the questions.txt file.
Acknowledgements:
The project was developed as part of the COP1250C course at Florida International University, and the game was a collaborative effort by Rama Skik, Jeremy Thomas, and Brandon Gerber.
License:
This project is for educational purposes and is not licensed for commercial use.
