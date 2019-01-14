
public class euler5 {
	public static boolean isDiv(int num) {
		for(int i = 2; i < 21; i ++) {
			if (num % i != 0 ) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int max = 2520;
		while (true) {
			if(isDiv(max)) {
				System.out.println(max);
				break;
			}
			max += 2520;
		}
	
	}

}
