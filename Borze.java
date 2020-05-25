import java.util.Scanner;

public class Borze {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int i = 0;
		in.close();

		while (i < s.length()) {

			if (i < s.length() - 1 && s.substring(i, i + 2).equals("--")) {
				System.out.print(2);
				i += 2;
			} else if (i < s.length() - 1 && s.substring(i, i + 2).equals("-.")) {
				System.out.print(1);
				i += 2;
			} else {
				System.out.print(0);
				i++;
			}
		}
	}
}
