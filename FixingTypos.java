import java.util.Scanner;

public class FixingTypos {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		char b = '1', c = '2', d = '3';
		for (int i = 0; i < s.length(); i++) {

			char a = s.charAt(i);
			if (!((a == b && a == c) || (a == b && c == d))) {
				System.out.print(a);
				d = c;
				c = b;
				b = a;
			}
		}
		in.close();
	}
}
