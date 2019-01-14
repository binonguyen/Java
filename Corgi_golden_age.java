

// Give an array of integers:
// arr = [100, -101, 200, -3, 1000]
// Find out the biggest sum of 2 integer
// And return the INDEX of those integer
public class Corgi_golden_age {

	public static void main(String[] args) {
		int[] arr = {100, -101, 200, -3, 1000};
		int max = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+ arr[j] > max) {
					max = arr[i] + arr[j];
					System.out.println(i +","+ j);
					
				}
				
			}
		}
		

	}

}
