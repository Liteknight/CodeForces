import java.util.Scanner;

public class CashierBreaks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), a = in.nextInt(), b = 0, x = 0;
		while (n-- > 0) {
			
			int t = in.nextInt(), l = in.nextInt();
			b += (t - x) / a;
			x = t + l;
		}
		System.out.println(b + (m - x) / a);
		in.close();
	}
}
