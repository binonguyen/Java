
public class euler28 {

	public static void main(String[] args) {
		int corner = 1, gap = 2, total = 1;
		while (corner < 1001*1001) {
			for(int i = 0; i < 4; i++) {
				corner += gap;
				total += corner;
			}
			gap += 2;
		}
		System.out.print(total);
	}
}
