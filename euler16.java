import java.math.BigInteger;
public class euler16 {

	public static void main(String[] args) {
		int sum = 0;
		//BigInteger n = new BigInteger("2");
		BigInteger n = BigInteger.TWO;
		n = n.pow(1000);
		//String s = n.toString();
		String s = String.valueOf(n);
		String [] arr = s.split("");
		
		for (int i = 0; i < arr.length; i ++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);

	}
}
