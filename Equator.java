import java.util.Scanner;

public class Equator {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n];
		a[0] = in.nextInt();

		for (i = 1; i < n; i++)
			a[i] = in.nextInt() + a[i - 1];
		in.close();

		for (i = 0; i < n; i++)
			if (a[i] >= Math.round(a[n - 1] / 2.0)) {
				System.out.println(i + 1);
				break;
			}
	}
}
