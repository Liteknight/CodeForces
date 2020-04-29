import java.util.Scanner;

public class NewYearHurry {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, t = 0, p = 0;
		final int MIDNIGHT = 240;
		in.close();

		for (i = 1; i <= n; i++) {
			if (t + i * 5 <= MIDNIGHT - k) {
				t += i * 5;
				p++;
			}
		}
		System.out.println(p);
	}
}
