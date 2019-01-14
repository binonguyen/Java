//# write a method take an array of number
//# Return sum of multiply number by index
//# crazy_sum([2,]) == 0 /2*0
//# crazy_sum([2,3,]) == 3 /2*0 + 3*1
//# crazy_sum([2,3,5,]) == 13 /2*0 + 3*1 + 5*2
//# crazy_sum([2,3,5,2]) == 19 /2*0 + 3*1 + 5*2 + 2*3
//#
//


public class crazy_sum {
//	public static int crazy_sum(int [] num) {
//		int sum = 0;
//		for (int i = 0 ; i < num.length; i ++) {
//			sum += num[i]*i;
//		}
//		System.out.println(sum);
//		return sum;
//	}
	public static void main(String[] args) {
		int [] crazy_sum = {2,3,5,2};
		int sum = 0;
		for (int i = 0 ; i < crazy_sum.length; i ++) {
			sum += crazy_sum[i]*i;
		}
		System.out.println(sum);
		
	}
	

}
