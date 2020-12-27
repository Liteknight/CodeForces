import java.util.Arrays;
import java.util.Scanner;

public class PetyaStairs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, a[] = new int[m];

		for (i = 0; i < m; i++) {
			a[i] = in.nextInt();
			if (a[i] == 1 || a[i] == n) {
				System.out.println("NO");
				return;
			}
		}
		in.close();
		Arrays.sort(a);

		for (i = 2; i < m; i++) {
			if (a[i] - a[i - 1] == 1 && a[i - 1] - a[i - 2] == 1) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
