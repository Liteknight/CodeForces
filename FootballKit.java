import java.util.Scanner;

public class FootballKit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, h[] = new int[1000001], a[] = new int[1000001];

		for (i = 0; i < n; i++) {
			h[in.nextInt()]++;
			a[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {
			System.err.println(h[i]);
			int x = n - 1 + h[a[i]], y = n - 1 - h[a[i]];
			System.out.println(x + " " + y);
		}
	}
}
