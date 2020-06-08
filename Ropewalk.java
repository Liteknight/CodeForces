import java.util.Arrays;
import java.util.Scanner;

public class Ropewalk {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] a = { in.nextInt(), in.nextInt(), in.nextInt() };
		int d = in.nextInt(), i, c = 0;
		in.close();

		Arrays.sort(a);
		for (i = 0; i < 2; i++) {
			int x = d - (a[i + 1] - a[i]);
			
			if (x > 0) {
				if (i == 0) {
					a[i] -= x;
				} else {
					a[i + 1] += x;
				}
				c += x;
			}
		}
		System.out.println(c);
	}
}
