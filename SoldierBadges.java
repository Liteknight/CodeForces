import java.util.Arrays;
import java.util.Scanner;

public class SoldierBadges {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], c = 0, p = 0;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		Arrays.sort(a);

		for (i = 0; i < n; i++) {
			c += Math.max(0, p - a[i] + 1);
			p = Math.max(p + 1, a[i]);
		}
		System.out.println(c);
	}
}
