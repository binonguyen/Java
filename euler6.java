
public class euler6 {

	public static void main(String[] args) {
		int sum_of_square = 0;
		int total = 0;
		for (int i = 0; i < 101; i++) {
			sum_of_square += i*i;
			total += i;
			
		}
		int diff = total*total - sum_of_square;
		System.out.println(diff);
	}
	

}
