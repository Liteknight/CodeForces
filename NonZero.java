import java.util.Scanner;

public class NonZero {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;

		for (i = 0; i < t; i++) {

			int n = in.nextInt(), j, sum = 0, moves = 0;

			for (j = 0; j < n; j++) {

				int a = in.nextInt();

				if (a == 0) {
					moves++;
					a++;
				}
				sum += a;
			}
			if (sum == 0) {
				moves++;
			}
			System.out.println(moves);
		}
		in.close();
	}
}
