import java.util.Scanner;

public class CrosswordSolving {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), d = n, i, l, r;
		String s = in.next(), t = in.next(), o = "";
		in.close();

		for (l = 0, r = n; r <= m; l++, r++) {
			String c = t.substring(l, r);
			int x = 0;

			for (i = 0; i < n; i++)
				if (c.charAt(i) != s.charAt(i))
					x++;			
			if (x <= d) {
				d = x;
				o = c;
			}
		}
		System.out.println(d);
		for (i = 0; i < n; i++)
			if (s.charAt(i) != o.charAt(i))
				System.out.print((i + 1) + " ");
	}
}
