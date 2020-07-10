import java.util.Scanner;

public class Candies {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), k;

			for (k = 2; k <= 32; k++) {
				double p = Math.pow(2, k) - 1;

				if (n % p == 0) {
					System.out.println((int) (n / p));
					break;
				}
			}
		}
		in.close();
	}
}
