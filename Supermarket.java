import java.util.Scanner;

public class Supermarket {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		double c = Double.POSITIVE_INFINITY;

		while (n-- > 0) {
			double a = in.nextDouble(), b = in.nextDouble();
			if (a / b < c) {
				c = a / b;
			}
		}
		in.close();
		System.out.println(c * m);
	}
}
