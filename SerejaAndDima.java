import java.util.Scanner;

public class SerejaAndDima {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, s = 0, d = 0, j = 0, k = n - 1;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {

			if (a[j] > a[k]) {
				if (i % 2 == 0) {
					s += a[j];
				} else {
					d += a[j];
				}
				j++;
				
			} else {
				if (i % 2 == 0) {
					s += a[k];
				} else {
					d += a[k];
				}
				k--;
			}
		}
		System.out.println(s + " " + d);
	}
}
