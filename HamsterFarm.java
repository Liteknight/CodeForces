import java.util.Scanner;

public class HamsterFarm {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), l = Long.MAX_VALUE, m = -1;
		int k = in.nextInt(), i, j = -1;

		for (i = 1; i <= k; i++) {
			long a = in.nextLong(), x = n / a, y = n % a;
			if (y < l) {
				m = x;
				j = i;
				l = y;
			}
		}
		in.close();
		System.out.println(j + " " + m);
	}
}
