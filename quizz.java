import java.util.Scanner;
public class quizz {
	public static void test(Question [] questions) {
		int score = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].promp);
			String user = keyboard.nextLine();
			if(user.equals(questions[i].answer)) {
				score ++;
			}
		}
		System.out.println("You got " + score + "/"+ questions.length+ " correct ");	
	}
	public static void main (String [] args) {
		String p1 = "What color are apples?\n(a) Red/Green\n(b) Purple\n(c) Orange\n\n";
		String p2 = "What color are Bananas?\n(a) Teal\n(b) Magenta\n(c) Yellow\n\n";
		
		Question [] questions = {
				new Question(p1, "a"),
				new Question(p2, "c")
		};
		
		test(questions);
		
	}
}


class Question{
	String promp;
	String answer;
	
	public Question(String promp, String answer) {
		this.promp = promp;
		this.answer = answer;
	}
}