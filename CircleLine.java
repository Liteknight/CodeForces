import java.util.Scanner;

public class CircleLine {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), d[] = new int[n], i, d1 = 0, d2 = 0;

		for (i = 0; i < n; i++) {
			d[i] = in.nextInt();
		}
		int s = in.nextInt() - 1, t = in.nextInt() - 1, j = s;
		while (j != t) {
			d1 += d[j];
			j++;
			if (j >= n) {
				j = 0;
			}
		}
		while (s != t) {
			s--;
			if (s < 0) {
				s = n - 1;
			}
			d2 += d[s];
		}
		in.close();
		System.out.println(Math.min(d1, d2));
	}
}
