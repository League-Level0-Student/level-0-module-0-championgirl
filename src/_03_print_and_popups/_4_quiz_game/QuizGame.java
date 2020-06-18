package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String a=JOptionPane.showInputDialog("Do you like goats?");
		
		if( a.equals("?") ) {
			System.out.println("You got it right!");
	score=score+1;
		}
		else { score=score-1;
			System.out.println("Wrong! the correct answer was ?");

		}
				// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("Who was the 1st president ?");
		if( answer.equals("George Washington") ) {
			System.out.println("Good!");
			score=score+1;
		}
		else {
			System.out.println("WRONG!!!.");
			score=score-1;
		}
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		System.out.println(score);
	}
}
