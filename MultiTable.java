import java.util.Scanner;

public class MultiTable {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = 0;
		long x = in.nextLong();

		for (i = 1; i <= n; i++) {
			if (x % i == 0 && x / i <= n) {
				c++;
			}
		}
		in.close();
		System.out.println(c);
	}
}
