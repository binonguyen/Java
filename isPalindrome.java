//# Write a method is_palindrome(word) that takes in a string word and returns the true if the word is a palindrome, false otherwise. A palindrome is a word that is spelled the same forwards and backwards.
//#
//# puts is_palindrome("racecar")  # => true
//# puts is_palindrome("kayak")    # => true
//# puts is_palindrome("bootcamp") # => false
public class isPalindrome {
	public static boolean is_palindrome (String w) {
		String n = "";
		for (int i = 0; i < w.length(); i++) {
			char c = w.charAt(i);
			n = c + n;
		}
		
		if (n.equals(w)) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(is_palindrome("racecar"));
		System.out.println(is_palindrome("kayak"));
		System.out.println(is_palindrome("bootcamp"));

	}

}
