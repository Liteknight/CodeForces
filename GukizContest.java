import java.util.Scanner;

public class GukizContest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = 2000, p = 1, c = 0;
		int[] a = new int[n], b = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		while (x > 0) {
			for (i = 0; i < n; i++) {
				
				if (a[i] == x) {
					b[i] = p;
					c++;
				}
			}
			p += c;
			c = 0;
			x--;
		}
		for (int j : b) {
			System.out.print(j + " ");
		}
	}
}
