import java.util.Scanner;

public class guessing {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String secretWord = "hello";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		while(!guess.equals(secretWord) && !outOfGuesses) {
			if(guessCount < guessLimit) {
				System.out.print("Enter a guess: ");
				guess = keyboard.nextLine();
				guessCount++;
				
			}else {
				outOfGuesses = true;
			}

		}
		if (outOfGuesses) {
			System.out.println("You lose");
		}else {
			System.out.println("You win");
		}
		
		
	}
}
