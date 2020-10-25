import java.util.Arrays;
import java.util.Scanner;

public class ArraySets {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], b = 0, c = 0, d = 0;
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();

		in.close();
		Arrays.sort(a);
		String s1 = "", s2 = "", s3 = "";

		for (i = n - 1; i >= 0; i--) {
			if (a[i] == 0) {
				s3 += a[i] + " ";
				d++;
			} else if (a[i] > 0) {
				s2 += a[i] + " ";
				c++;
			} else {
				if (c < 1) {
					s2 += a[i] + " " + a[i - 1] + " ";
					c += 2;
					i--;
				} else if (b < 1) {
					s1 += a[i] + " ";
					b++;
				} else {
					s3 += a[i] + " ";
					d++;
				}
			}
		}
		System.out.printf("%d %s\n%d %s\n%d %s", b, s1, c, s2, d, s3);
	}
}
