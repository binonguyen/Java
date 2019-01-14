
public class euler14 {
	public static int getCount (long number) {
		int count = 0;
		while(number > 1) {
			if(number % 2 == 0) {
				count ++;
				number = number/2;
			}else {
				count ++;
				number = number*3 + 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int max = 0;
		for (long n = 800000; n < 1000000; n++) {
			int current = getCount(n);
			if (current > max) {
				max = current;
				System.out.println(n);
			}
		}

	}

}
