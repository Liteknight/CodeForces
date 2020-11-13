import java.util.Scanner;

public class Chocolates {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;

		Long a[] = new Long[n];
		for (i = 0; i < n; i++)
			a[i] = in.nextLong();

		long x = a[n - 1], m = x;
		for (i = n - 2; i >= 0; i--) {
			if (m > 0) {
				
				x += Math.min(m - 1, a[i]);
				m = Math.min(m - 1, a[i]);
			} else {
				break;
			}
		}
		in.close();
		System.out.println(x);
	}
}
