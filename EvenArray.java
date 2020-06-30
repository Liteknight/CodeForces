import java.util.Scanner;

public class EvenArray {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i, w1 = 0, w2 = 0;
			
			for (i = 0; i < n; i++) {
				int x = in.nextInt();
				
				if (x % 2 == 0 && i % 2 == 1) {
					w1++;
				} else if (x % 2 == 1 && i % 2 == 0) {
					w2++;
				}
			}
			System.out.println(w1 == w2 ? w1 : -1);
		}
		in.close();
	}
}
