//# https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class valleycount {
    static int countingValleys(int n, String s) {
        int valley = 0;
        int count = 0;
        Character u = new Character('U');
        Character d = new Character('D');
        for (int i = 0; i < n; i++){
            if (u.equals(s.charAt(i))) {
                count ++;
            }else if
                (d.equals(s.charAt(i))){
                count --;
                if(count == -1){
                    valley ++;
                }
            }
        }

        return valley;
    }
	public static void main(String[] args) {
		
		
	}

}
