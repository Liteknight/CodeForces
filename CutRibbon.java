import java.util.Scanner;

public class CutRibbon {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), m = 0;
		in.close();

		for (int x = 0; x * a <= n; x++) {
			for (int y = 0; y * b + x * a <= n; y++) {
				int z = (n - x * a - y * b) / c;
				
				if (x * a + y * b + z * c == n) {
					m = Math.max(m, x + y + z);
				}
			}
		}
		System.out.println(m);
	}
}