import java.math.BigInteger;

public class euler20 {

	public static void main(String[] args) {
		int num = 100;
		BigInteger mul = BigInteger.ONE;
		int sum = 0;
		for(int i = 1; i < num + 1; i++) {
			mul = mul.multiply(BigInteger.valueOf(i));
		}
		
		String str_mul = mul.toString();
		String [] arr = str_mul.split("");
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);

	}

}
