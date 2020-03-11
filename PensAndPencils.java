import java.util.Scanner;

public class PensAndPencils {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), i;

		for (i = 0; i < t; i++) {

			double a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), k = in.nextInt();

			// Classes divided by classes per utensil, rounded up
			int x = (int) Math.ceil(a / c), y = (int) Math.ceil(b / d);

			if (x + y <= k) {
				System.out.println(x + " " + y);

			} else {
				System.out.println(-1);
			}
		}
		in.close();
	}
}
