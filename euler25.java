import java.math.BigInteger;
public class euler25 {
	public static int getCount(BigInteger num) {
		String s = String.valueOf(num);
		int count = s.length();
		return (count);
	}
	
	
	public static void main(String[] args) {
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = BigInteger.ONE;
		BigInteger f3 = BigInteger.TWO;
		int count = 1000;
		int index = 3;
		while (getCount(f3) != count) {
			f1 = f2;
			f2 = f3;
			f3 = f2.add(f1);
			index += 1;
			
		}
			
		
		System.out.println(index);
		
	}

}
