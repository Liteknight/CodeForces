import java.util.Scanner;

public class LPonySortShift {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], c = 0, j = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (i > 0 && a[i] < a[i - 1]) {
				c++;
				j = i;
			}
		}
		in.close();
		System.out.println(c == 0 ? 0 : c == 1 && a[n - 1] <= a[0] ? n - j : -1);
	}
}
