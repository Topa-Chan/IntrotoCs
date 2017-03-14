/*
 * Tyler Patterson
 * 7 March 2017
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class QuizTime {

	static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	private String question;
	private String answer;
	private String choice;
	private boolean valid = false;
	Quiz quiz = new Quiz();
	
	public static void main(String[] args) throws IOException {
		
		(new QuizTime()).run();

	}
	
	public void run() throws IOException {
		do {
		System.out.println("Would You Like To Add A Question?");
		System.out.print("Please Entre y/n: ");
		choice = scan.readLine();
		System.out.println();
		if (choice.equals("y") || choice.equals("Y")) {
			System.out.println("What Is Your Question?");
			System.out.print("Please Entre Your Question: ");
			question = scan.readLine();	
			System.out.println();
			System.out.println("What Is Your Answer?");
			System.out.print("Please Entre Your Answer: ");
			answer = scan.readLine();
			quiz.Add(new Question(question, answer));
		} else {
			System.out.println("Okay, Time To Take Your Quiz.");
			quiz.displayQuiz();
			valid = true;
		}
		} while(!valid);
		
	
	}

}
