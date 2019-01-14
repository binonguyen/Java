import java.math.BigInteger;
import java.util.ArrayList;

public class euler29 {
	public static void main(String[] args) {
	ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
	
		for (int i = 2; i < 101; i ++) {
			for (int j = 2; j < 101; j ++) {
				BigInteger num = BigInteger.valueOf(i).pow(j);
				if (!arr.contains(num)) {
					arr.add(num);
				}
			}	
		}
		System.out.print(arr.size());
	
			
		
	}
}
