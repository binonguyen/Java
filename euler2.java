
public class euler2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = a + b;
		int sum = 0;
		while (c < 4000001) {
			a = b;
			b = c;
			c = a + b;
			if (c % 2 == 0) {
				sum += c;
			}
					
		}
		System.out.println(sum);	
	}

}
