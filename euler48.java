import java.math.BigInteger;
public class euler48 {

	public static void main(String[] args) {

		BigInteger sum  = BigInteger.ONE;
		for(int i = 2; i < 1001; i ++) {
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		
		String s = sum.toString();
		
		System.out.println(s.substring(s.length()-10));
	}

}
