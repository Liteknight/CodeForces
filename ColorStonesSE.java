import java.util.Scanner;

public class ColorStonesSE {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), t = in.next();
		int c = 0, i;
		in.close();

		for (i = 0; i < t.length(); i++) {
			if (t.charAt(i) == s.charAt(c)) {
				c++;
			}
		}
		System.out.println(c + 1);
	}
}
