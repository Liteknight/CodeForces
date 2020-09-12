import java.util.Scanner;

public class TernaryXOR {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), i;
			StringBuilder x = new StringBuilder(), y = new StringBuilder();
			String s = in.next();
			boolean b = true;

			for (i = 0; i < n; i++) {
				int c = s.charAt(i) - '0';
				if (b) {
					x.append(c / 2 + c % 2);
					y.append(c / 2);

					if (c % 2 > 0)
						b = false;
				} else {
					x.append("0");
					y.append(c);
				}
			}
			System.out.println(x + "\n" + y);
		}
		in.close();
	}
}
