import java.util.Scanner;

public class BuyingHouse {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt(), d = 100, i;
		for (i = 1; i <= n; i++) {
			
			int a = in.nextInt();
			if (a <= k && a > 0) {
				d = Math.min(d, Math.abs(m - i));
			}
		}
		in.close();
		System.out.println(d * 10);
	}
}
