import java.util.Scanner;

public class IQTest4x4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char c[][] = new char[4][4];
		int i, j, o = 0;

		for (i = 0; i < 4; i++) {
			String s = in.next();
			for (j = 0; j < 4; j++)
				c[i][j] = s.charAt(j);
		}
		in.close();

		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++) {
				int a[] = new int[50];

				a[c[i][j] + 0]++;
				a[c[i + 1][j] + 0]++;
				a[c[i][j + 1] + 0]++;
				a[c[i + 1][j + 1] + 0]++;

				if (a[35] > 2 || a[46] > 2)
					o = 1;
			}
		System.out.println(o == 1 ? "YES" : "NO");
	}
}
