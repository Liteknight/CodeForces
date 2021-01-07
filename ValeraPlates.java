import java.util.Scanner;

public class ValeraPlates {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt(), i;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();

			if (a == 1 || k < 1) {
				m--;
			} else {
				k--;
			}
		}
		in.close();
		System.out.println(Math.abs(Math.min(0, m)));
	}
}
