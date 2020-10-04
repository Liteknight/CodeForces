import java.util.Scanner;

public class DZYChess {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j;

		for (i = 0; i < n; i++) {
			String s = in.next();
			for (j = 0; j < m; j++)

				System.out.print(s.charAt(j) == '.' ? ((i + j) % 2 == 0 ? 'B' : 'W') : '-');
			System.out.println();
		}
		in.close();
	}
}
