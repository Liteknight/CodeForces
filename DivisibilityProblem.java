import java.util.Scanner;

public class DivisibilityProblem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			double a = in.nextDouble(), b = in.nextDouble();

			long o = (long) ((long) Math.ceil(a / b) * b - a);
			System.out.println(o);
		}
		in.close();
	}
}
