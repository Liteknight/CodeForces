import java.util.Arrays;
import java.util.Scanner;

public class LilEleProblem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], b[] = new int[n], i, c = 0;

		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			a[i] = x;
			b[i] = x;
		}
		in.close();
		Arrays.sort(b);

		for (i = 0; i < n; i++) {
			if (a[i] != b[i])
				c++;
			if (c > 2)
				break;
		}
		System.out.println(c > 2 ? "NO" : "YES");
	}
}
