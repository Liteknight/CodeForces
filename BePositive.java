import java.util.Scanner;

public class BePositive {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, pos = 0, neg = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a > 0) {
				pos++;
			} else if (a < 0) {
				neg++;
			}
		}
		if (pos >= neg && pos >= Math.round(n / 2.0)) {
			System.out.println(1);
		} else if (neg > pos && neg >= Math.round(n / 2.0)) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}
		in.close();
	}
}
