//# Write method take a number max
//# return perfect sqaure less than max
//# No math or **
//# sqaure(5) == 2
//# square(10) == 3
//# square(25) == 4
public class square_nums {
	public static int square(int num) {
		int result = 1;
		int mul = 1;
		while (mul < num){
			result += 1;
			mul = result * result;
			
		}
		return result-1;
	}
	public static void main(String[] args) {
		int max = square(5);
		System.out.print(max);

	}

}
