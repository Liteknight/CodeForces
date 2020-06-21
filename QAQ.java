import java.util.Scanner;

public class QAQ {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int c = 0, i, j, k;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'Q') {

				for (j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == 'A') {

						for (k = j + 1; k < s.length(); k++) {
							if (s.charAt(k) == 'Q') {
								c++;
							}
						}
					}
				}
			}
		}
		System.out.println(c);
	}
}