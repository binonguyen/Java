//# Write a method count_a(word) that takes in a string word and returns the number of a's in the word. The method should count both lowercase (a) and uppercase (A)
//# puts count_a("application")  # => 2
//# puts count_a("bike")         # => 0
//# puts count_a("Arthur")       # => 1
//# puts count_a("Aardvark")     # => 3
public class CountA {
	public static int count_a(String s) {
		String new_s = s.toLowerCase();
		Character a = new Character('a');
		int count = 0;
		for (int i = 0; i < s.length(); i ++) {
			if(a.equals(new_s.charAt(i))) {
				count += 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println(count_a("application") );
		System.out.println(count_a("bike") );
		System.out.println(count_a("Arthur") );
		System.out.println(count_a("Aardvark") );

	}

}
