

import java.util.Arrays;
import java.util.HashSet;

//# Sock Merchant
//#  It must return an integer representing the number of matching pairs of socks that are available.
//# Sample Input
//# 9
//# 10 20 20 10 10 30 50 10 20
//# Sample Output
//# 3

public class SockPair {

	static int sockMerchant(int n, Integer[] arr) {
        HashSet<Integer> new_array = new HashSet<Integer>();
        
        int count = 0;
        for (int i = 0; i < n; i++){
            int num = arr[i];
            if (new_array.contains(num)){
                count++;
                new_array.remove(num);
            }else{
                new_array.add(num);
            }
        }
        System.out.println(count);
        return count;
    }
	
	public static void main (String [] args) {
		Integer [] arr = {10, 20,20 ,10, 10 ,30, 50, 10, 20};
		int n = 9;
		sockMerchant(n, arr);
		
		
	}
	
}
	

