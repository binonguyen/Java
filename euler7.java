
public class euler7 {
	public static boolean isPrime( int num) {
		if (num == 2) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(num)+1; i++) {			
			
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int result = 2;
		int count = 0;
		while (count != 10001) {
			if(isPrime(result)) {
				count ++;
				System.out.println(result);
			}
			result ++;
		}
	}
}
