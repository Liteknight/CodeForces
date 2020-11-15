import java.util.Scanner;

public class SnackTower {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = n;
		boolean a[] = new boolean[n + 1];

		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			a[x] = true;
			int j = x;

			if (c == x)
				while (j > 0 && a[j]) {
					System.out.print(j + " ");
					a[j] = false;
					j--;
					c--;
				}
			System.out.println();
		}
		in.close();
	}
}
