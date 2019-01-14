
public class euler9 {
	public static boolean isPy (int a , int b , int c) {
		if (a*a + b*b != c*c) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int result = 1;
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				int c = 1000 - a - b;
				if(isPy(a,b,c)) {
					result = a*b*c;
				}
			}
		}
		System.out.println(result);	
	}

}
