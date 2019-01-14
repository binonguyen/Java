//# https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen

public class jumponcloud {
	 static int jumpingOnClouds(int[] c) {
	        int jump = 0;
	        int i = 0;
	        while (i < c.length - 1){
	        	if (i+2 < c.length & c[i+2] != 1 ) {
	        		jump ++ ;
	        		i+= 2;
	        	}else {
	        		jump++;
	        		i++;
	        	}
	        		
	        }
	            
	        return jump;
	    }
 
	public static void main(String[] args) {
		int [] arr = {0, 0, 1, 0, 0, 1, 0};
		int a = jumpingOnClouds(arr);
		System.out.println(a);;

	}

}
