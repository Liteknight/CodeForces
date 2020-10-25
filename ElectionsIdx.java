import java.util.Scanner;

public class ElectionsIdx {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, c[] = new int[n], w = 0, wi = 0;

		for (i = 0; i < m; i++) {
			int x = 0, idx = 0;
			for (j = 0; j < n; j++) {
				int y = in.nextInt();
				if (y > x) {
					x = y;
					idx = j;
				}
			}
			c[idx]++;
		}
		in.close();
		for (i = 0; i < n; i++) {
			if (c[i] > w) {
				w = c[i];
				wi = i;
			}
		}
		System.out.println(wi + 1);
	}
}
