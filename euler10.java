
public class euler10 {
	public static boolean isPrime (int num) {
		for(int i = 2; i < Math.sqrt(num)+ 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int number = 3;
		long result = 2;
		while (number < 2000001){
			if (isPrime(number)) {
				result += number;
			}
			number += 2;
		}
		System.out.println(result);
	}

}
