import java.util.Scanner;

public class GameWString {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		char[] a = new char[s.length()];
		int top = 0, w = 1, i;
		a[top++] = s.charAt(0);

		for (i = 1; i < s.length(); i++) {
			if (top == 0) {
				a[top++] = s.charAt(i);

			} else if (s.charAt(i) == a[top - 1]) {
				top--;
				w = 1 - w;
			} else {
				a[top++] = s.charAt(i);
			}
		}
		System.out.println(w == 0 ? "Yes" : "No");
	}
}
