import java.util.Scanner;

public class Word {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int i = s.length(), upper = 0, lower = 0;

		while (i-- > 0) {
			if (s.substring(i, i + 1).equals(s.substring(i, i + 1).toLowerCase())) {
				lower++;
			} else { upper++; }
		}
		System.out.println(upper > lower ? s.toUpperCase() : s.toLowerCase());
		in.close();
	}
}
