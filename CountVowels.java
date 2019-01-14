import java.util.ArrayList;

//# Write a method, count_vowels(word), that takes in a string word and returns the number of vowels in the word. Vowels are the letters a, e, i, o, u.
//#
//# puts count_vowels("bootcamp")  # => 3
//# puts count_vowels("apple")     # => 2
//# puts count_vowels("pizza")     # => 2
public class CountVowels {
	public static int count_vowels(String s) {
		int count = 0;
		String vowels = "aeoui";
		String [] arr = s.split("");		
		for (int i = 0; i < arr.length; i ++) {
			if (vowels.contains(arr[i])) {
				count += 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count_vowels("bootcamp"));
		System.out.println(count_vowels("apple"));
		System.out.println(count_vowels("pizza"));

	}

}
