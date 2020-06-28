import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i, m = 1000;
			int[] a = new int[n];

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for (i = 1; i < n; i++) {
				
				int d = a[i] - a[i - 1];
				if (d < m) {
					m = d;
				}
			}
			System.out.println(m);
		}
		in.close();
	}
}
