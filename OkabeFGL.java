import java.util.Scanner;

public class OkabeFGL {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[][] = new int[n][n], i, j, k;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int[] ai : a) {
			out: for (i = 0; i < n; i++) {
				if (ai[i] > 1) {
					
					for (j = 0; j < n; j++) {
						for (k = 0; k < n; k++) {
							if (a[k][i] + ai[j] == ai[i]) {
								continue out;
							}
						}
					}
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
