import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;

		for (i = 0; i < t; i++) {
			int n = in.nextInt(), k1 = in.nextInt(), k2 = in.nextInt(), j, max1 = 0, max2 = 0;

			for (j = 0; j < k1; j++) {
				int a = in.nextInt();
				if (a > max1) {
					max1 = a;
				}
			}
			for (j = 0; j < k2; j++) {
				int b = in.nextInt();
				if (b > max2) {
					max2 = b;
				}
			}
			if (max1 > max2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}
