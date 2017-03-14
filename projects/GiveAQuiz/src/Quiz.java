/*
*Tyler Patterson
*7 March 2017 
*/
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	private String answer;
	private int counter = 0;
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	private Question[] questions;
	private int i = 0;
	
	public Quiz() {
		questions = new Question[25];
	}

	public void Add(Question q) {
		questions[i] = q;
		i++;
	}
	
	public void displayQuiz() throws IOException {
		for (int i = 0; i < questions.length; i++) {
			if (questions[i] != null) {
			System.out.println(questions[i]);
			System.out.print("Please Entre Your Answer: ");
			answer = scan.readLine();
			if (answer.equals(questions[i].getAnswer())) {
				System.out.println("Correct!");
				counter++;
			} else {
				System.out.println("Incorrrect");
			}
			System.out.println("You Got " + counter + " Out Of " + (i + 1) + " Correct.");
			} 
		}
	}
	
}
