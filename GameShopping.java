import java.util.Scanner;

public class GameShopping {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), a[] = new int[n], b[] = new int[m], i, j = 0, c = 0;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {
			if (j < m && b[j] >= a[i]) {
				c++;
				j++;
			}
		}
		System.out.println(c);
	}
}
