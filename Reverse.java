//# Write a method reverse(word) that takes in a string word and returns the word with its letters in reverse order.
//#
//# puts reverse("cat")          # => "tac"
//# puts reverse("programming")  # => "gnimmargorp"
//# puts reverse("bootcamp")     # => "pmactoob"
public class Reverse {
	public static String result (String w) {
		String n = "";
		for (int i = 0; i < w.length(); i++) {
			char c = w.charAt(i);
			n = c + n;
		}
		return n;
		
	}
	public static void main(String[] args) {
		System.out.println(result("cat"));
		System.out.println(result("programming"));
		System.out.println(result("bootcamp"));

	}

}
