import java.util.Scanner;

public class FlippingGame {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), o = 0, z = 0, m = -1, i;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a == 1) {
				o++;
				if (z > 0) {
					z--;
				}
			} else {
				z++;
				m = Math.max(m, z);
			}
		}
		in.close();
		System.out.println(o + m);
	}
}
