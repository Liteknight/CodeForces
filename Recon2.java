import java.util.Scanner;

public class Recon2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, m = 999, i1 = 0, i2 = 0, d;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {
			d = i == n - 1 ? Math.abs(a[i] - a[0]) : Math.abs(a[i + 1] - a[i]);
			
			if (d < m) {
				m = d;
				i1 = i + 1;
				i2 = i != n - 1 ? i + 2 : 1;
			}
		}
		System.out.println(i1 + " " + i2);
	}
}
