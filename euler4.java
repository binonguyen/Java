
public class euler4 {
	public static boolean isPal(int num) {
		int copy = num;
		int revert = 0;
		while (copy > 0) {
			revert = revert*10 + copy % 10;
			copy = copy / 10;	
		}
		if (revert == num) {
			return true;
		}else {
			return false;
		}
	}
			
	public static void main(String[] args) {
		int max = 0;
		for (int i = 1; i < 1000; i ++) {
			for (int j = 1; j < 1000; j ++) {
				int result = i * j ;
				if(isPal(result)) {
					if (result > max) {
						max = result;
					}
				}
			}
		}
		System.out.print(max);
	}

}
