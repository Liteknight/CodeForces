import java.util.Arrays;
import java.util.Scanner;

public class PaintNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], c = 0, i;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();

		Arrays.sort(a);
		for (i = 0; i < n; i++) {
			if (a[i] < 0) {
				continue;
			}
			c++;
			for (int j = i + 1; j < n; j++) {
				if (a[j] % a[i] == 0) {
					a[j] = -1;
				}
			}
		}
		System.out.println(c);
	}
}
