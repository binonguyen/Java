import java.util.Scanner;
public class test {
	public static void run_test(Questions [] questions) {
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		for (int i = 0 ; i < questions.length; i++){
			System.out.println(questions[i].promp);
			String user = keyboard.next();
			if (user.equals(questions[i].answer)) {
				count ++;
			}
		}
		System.out.println(count+"/"+questions.length);
	}
	
	public static void main (String [] args) {
		
		String p1 = "A? \na = a\nb = b\nc = c";
		String p2 = "B? \na = a\nb = b\nc = c";
		
		
		Questions exam1 = new Questions("alo", "yes");
		Questions [] questions = {
			 new Questions(p1, "a"),
			 new Questions(p2, "b")
		};
		
		run_test(questions);
		
	}
}

class Questions {
	String promp;
	String answer;
	
	public Questions(String promp, String answer) {
		this.promp = promp;
		this.answer = answer;
	}
}