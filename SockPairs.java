import java.util.Scanner;

public class SockPairs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, m = 0, c = 0;
		boolean[] a = new boolean[n];

		for (i = 0; i < n * 2; i++) {
			int x = in.nextInt() - 1;
			c = a[x] ? c - 1 : c + 1;
			
			m = Math.max(m, c);
			a[x] = !a[x];
		}
		in.close();
		System.out.println(m);
	}
}
