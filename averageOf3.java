//
//# Write a method, num3) that returns the average of three numbers
//# puts average_of_three(3, 7, 8)   # => 6.0
//# puts average_of_three(2, 5, 17)  # => 8.0
//# puts average_of_three(2, 8, 1)   # => 3.666666

public class averageOf3 {
	public static float average_of_three(int a,int b, int c) {
		float ave ;
		int sum = 0;
		sum = a+b+c;
		ave = (float) (sum/3.0);
		return ave;
	}
	public static void main(String[] args) {
		System.out.println(average_of_three(3,7,8));

	}

}
