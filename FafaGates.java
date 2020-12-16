import java.util.Scanner;

public class FafaGates {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = 0, y = 0, o = 0;
		String s = in.next();
		in.close();

		for (i = 0; i < n - 1; i++) {
			if (s.charAt(i) == 'U')
				y++;
			if (s.charAt(i) == 'R')
				x++;
			if (s.charAt(i) == s.charAt(i + 1) && x == y)
				o++;
		}
		System.out.println(o);
	}
}
