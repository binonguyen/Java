//# number is divisible by either 3 or 5, but not both.
//# puts either_only(9)  # => true
//# puts either_only(20) # => true
//# puts either_only(7)  # => false
//# puts either_only(15) # => false
//# puts either_only(30) # => false
public class EitherOnly {
	public static boolean either_only(int i) {
		
		boolean check = (i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0);
		if (check) {
			return true;
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(either_only(12));

	}

}
