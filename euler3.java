
public class euler3 {

	public static void main(String[] args) {
		Long num = 600851475143L;
		int i = 2;
		while (num > 1){
			if (num % i == 0) {
				System.out.println(i);
				num = num/i;
				
			}else {
				i ++;
			}
		}
		
		

	}

}
