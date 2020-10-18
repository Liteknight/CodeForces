import java.util.Scanner;

public class LightsOut {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a[][] = new int[3][3], i, j;

		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				a[i][j] = 1;

		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++) {
				int x = in.nextInt();
				if (x % 2 != 0) {

					a[i][j] = 1 - a[i][j];
					// UP
					if (i < 2)
						a[i + 1][j] = 1 - a[i + 1][j];
					// DOWN
					if (i > 0)
						a[i - 1][j] = 1 - a[i - 1][j];
					// LEFT
					if (j > 0)
						a[i][j - 1] = 1 - a[i][j - 1];
					// RIGHT
					if (j < 2)
						a[i][j + 1] = 1 - a[i][j + 1];
				}
			}
		in.close();
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}
}
