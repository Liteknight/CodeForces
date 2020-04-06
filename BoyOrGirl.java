import java.util.Scanner;

public class BoyOrGirl {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] c = new char[s.length()];
		int i, j, chars = 0;

		for (i = 0; i < s.length(); i++) {			
			c[i] = s.charAt(i);
			
			boolean dup = false;			
			for (j = 0; j < i; j++) {

				if (s.charAt(i) == c[j]) {
					dup = true;
					break;
				}
			}
			if (!dup) {
				chars++;
			}
		}
		System.out.println((chars % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");
		in.close();
	}
}
