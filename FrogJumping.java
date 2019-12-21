
import java.util.Scanner;

public class FrogJumping {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(), j;

		for (j=0; j<t; j++) {
			
			long a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt(), pos=0;
			
			if (k % 2 == 0) {
				pos = a * (k / 2) - b * (k / 2);
				
			} else {
				pos = a * (k / 2 + 1) - b * (k / 2);
			}
			System.out.println(pos);
		}
		sc.close();
	}
}