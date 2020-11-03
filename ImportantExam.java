import java.util.Scanner;

public class ImportantExam {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j, a[][] = new int[m][5], t = 0;
		for (i = 0; i < n; i++) {
			
			String s = in.next();
			for (j = 0; j < m; j++)
				a[j][s.charAt(j) - 65]++;
		}
		for (i = 0; i < m; i++) {
			int c = 0;
			for (j = 0; j < 5; j++)
				c = Math.max(c, a[i][j]);
			t += c * in.nextInt();
		}
		in.close();
		System.out.println(t);
	}
}
