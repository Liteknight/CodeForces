import java.util.Scanner;

public class TextDocAnalysis {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, m = 0, l = 0, w = 0, wl = 0;
		String s = in.next();
		boolean p = false;

		in.close();
		for (i = 0; i < n; i++) {
			char c = s.charAt(i);

			if (c == '(') {
				p = true;
				m = Math.max(m, l);
				l = 0;
				wl = 0;
			} else if (c == ')') {
				p = false;
				m = Math.max(m, l);
				l = 0;
				wl = 0;
			} else if (c == '_') {
				m = Math.max(m, l);
				l = 0;
				wl = 0;
			} else if (c != '_' && !p) {
				l++;
			} else if (c != '_' && p && wl == 0) {
				w++;
				wl++;
			}
		}
		System.out.println(Math.max(m, l) + " " + w);
	}
}
