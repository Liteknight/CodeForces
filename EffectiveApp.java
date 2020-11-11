import java.util.Scanner;

public class EffectiveApp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n + 1];
		for (i = 1; i <= n; i++)
			a[in.nextInt()] = i;

		int m = in.nextInt();
		long x = 0, y = 0;
		
		for (i = 0; i < m; i++) {
			int b = in.nextInt();
			x += a[b];
			y += n - a[b] + 1;
		}
		in.close();
		System.out.println(x + " " + y);
	}
}
