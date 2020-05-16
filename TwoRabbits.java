import java.util.Scanner;

public class TwoRabbits {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			long x = in.nextLong(), y = in.nextLong(), a = in.nextLong(), b = in.nextLong(), d = y - x, j = a + b;

			System.out.println(d % j == 0 ? d / j : -1);
		}
		in.close();
	}
}
