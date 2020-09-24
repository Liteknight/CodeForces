import java.util.Scanner;

public class NewTheatreSq {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), m = in.nextInt(), x = in.nextInt(), y = in.nextInt(), i, j, p = 0;

			for (i = 0; i < n; i++) {
				String s = in.next();
				for (j = 0; j < m; j++) {
					char a = s.charAt(j);

					if (j < m - 1 && y / 2 < x && a == '.' && s.charAt(j + 1) == '.') {
						p += y;
						j++;
					} else if (a == '.') {
						p += x;
					}
				}
			}
			System.out.println(p);
		}
		in.close();
	}
}
