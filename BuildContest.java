import java.util.Scanner;

public class BuildContest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), a[] = new int[n], i, j, z = n;

		for (i = 0; i < m; i++) {
			int x = in.nextInt() - 1;
			a[x]++;

			if (a[x] == 1)
				z--;
			if (z < 1) {
				for (j = 0; j < n; j++) {
					a[j]--;

					if (a[j] < 1)
						z++;
				}
				System.out.print(1);
			} else {
				System.out.print(0);
			}
		}
		in.close();
	}
}
