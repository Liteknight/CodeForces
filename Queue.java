import java.util.Arrays;
import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, s = 0, d = 0;
		int a[] = new int[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();

		in.close();
		Arrays.sort(a);

		for (i = 0; i < n; i++) {
			if (s <= a[i]) {
				d++;
				s += a[i];
			}
		}
		System.out.println(d);

	}
}
