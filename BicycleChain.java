import java.util.Scanner;

public class BicycleChain {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, a[] = new int[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		int m = in.nextInt(), x = 0, y = 0;

		for (i = 0; i < m; i++) {
			int b = in.nextInt();

			for (j = 0; j < n; j++)
				if (b % a[j] == 0)

					if (b / a[j] > x) {
						x = b / a[j];
						y = 1;
					} else if (b / a[j] == x)
						y++;
		}
		in.close();
		System.out.println(y);
	}
}
