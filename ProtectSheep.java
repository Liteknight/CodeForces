import java.util.Scanner;

public class ProtectSheep {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int r = in.nextInt(), c = in.nextInt(), i, j;
		char[][] a = new char[r][c];
		boolean p = true;

		for (i = 0; i < r; i++) {
			String s = in.next();
			for (j = 0; j < c; j++)
				a[i][j] = s.charAt(j);
		}
		in.close();

		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				if (a[i][j] == 'W') {

					if (i > 0 && a[i - 1][j] == 'S') {
						p = false;
						break;
					} else if (i > 0 && a[i - 1][j] == '.') {
						a[i - 1][j] = 'D';
					}

					if (i < r - 1 && a[i + 1][j] == 'S') {
						p = false;
						break;
					} else if (i < r - 1 && a[i + 1][j] == '.') {
						a[i + 1][j] = 'D';
					}

					if (j > 0 && a[i][j - 1] == 'S') {
						p = false;
						break;
					} else if (j > 0 && a[i][j - 1] == '.') {
						a[i][j - 1] = 'D';
					}

					if (j < c - 1 && a[i][j + 1] == 'S') {
						p = false;
						break;
					} else if (j < c - 1 && a[i][j + 1] == '.') {
						a[i][j + 1] = 'D';
					}
				}
			}
		}
		if (p) {
			System.out.println("Yes");
			for (char x[] : a) {
				for (char y : x) {
					System.out.print(y);
				}
				System.out.println();
			}
		} else {
			System.out.println("No");
		}
	}
}
