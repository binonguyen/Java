//# Write a method count_e(word) that takes in a string word and returns the number of e's in the word
//# puts count_e("movie") # => 1
//# puts count_e("excellent") # => 3



public class CountE {
	public static int count_e (String w) {
		int count = 0;
		Character e = new Character('e');
		for (int i = 0; i < w.length(); i++) {
			if (e.equals(w.charAt(i))) {
				count += 1;
			}
		}
		return count;
		
				
	}
	public static void main(String[] args) {
		System.out.println(count_e("movie"));
		System.out.println(count_e("excellent"));

	}

}
