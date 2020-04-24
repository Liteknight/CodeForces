import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), l = in.nextInt(), i;
		int[] a = new int[n];
		double maxd = 0;

		for (i = 0; i < n; i++) { a[i] = in.nextInt(); }
		in.close();
		
		Arrays.sort(a);
		for (i = 1; i < n; i++) {

			double dis = (a[i] - a[i - 1]) / 2.0;
			if (dis > maxd) { maxd = dis; }
		}
		double edge = Math.max(a[0], l - a[n - 1]);
		System.out.println(Math.max(maxd, edge));
	}
}
