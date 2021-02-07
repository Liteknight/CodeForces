import java.util.Scanner;

public class VasyaGoldenTicket {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, x = 0;
		String s = in.next();

		for (i = 0; i < n; i++)
			x += s.charAt(i) - '0';
		in.close();
		boolean o = x == 0 ? true : false;

		for (i = 1; i < x; i++) {
			if (x % i == 0) {
				int c = 0;

				for (j = 0; j < n; j++) {
					c += s.charAt(j) - '0';
					if (c == i)
						c = 0;
				}
				if (c == 0)
					o = true;
			}
		}
		System.out.println(o ? "YES" : "NO");
	}
}
