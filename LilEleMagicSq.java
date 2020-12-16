import java.util.Scanner;

public class LilEleMagicSq {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i, j, a[][] = new int[3][3], s = 0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = in.nextInt();
				s += a[i][j];
			}
		}
		s /= 2;
		a[0][0] = s - a[0][1] - a[0][2];
		a[1][1] = s - a[1][0] - a[1][2];
		a[2][2] = s - a[2][0] - a[2][1];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
