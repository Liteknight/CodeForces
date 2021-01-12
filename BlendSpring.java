import java.util.Scanner;

public class BlendSpring {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), o = "NO";
		in.close();

		for (int i = 0; i < s.length() - 2; i++) {
			char c[] = new char[3];

			for (int j = i; j < i + 3; j++)
				if (s.charAt(j) != '.')
					c[s.charAt(j) - 65]++;

			if (c[0] == 1 && c[1] == 1 && c[2] == 1) {
				o = "YES";
				break;
			}
		}
		System.out.println(o);
	}
}
