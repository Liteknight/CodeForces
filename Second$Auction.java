import java.util.Arrays;
import java.util.Scanner;

public class Second$Auction {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, mp = 0, mi = 0, a[] = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (a[i] > mp) {
				mp = a[i];
				mi = i + 1;
			}
		}
		in.close();
		Arrays.sort(a);
		System.out.println(mi + " " + a[n - 2]);
	}
}
