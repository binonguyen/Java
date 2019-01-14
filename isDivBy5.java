//# puts is_div_by_5(10) # => true
//# puts is_div_by_5(40) # => true
//# puts is_div_by_5(42) # => false
//# puts is_div_by_5(8)  # => false
public class isDivBy5 {
	public static boolean is_div_by_5(int num) {
		if (num%5 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(is_div_by_5(18));

	}

}
