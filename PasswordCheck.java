import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		boolean u = false, l = false, d = false;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				u = true;
			else if (Character.isLowerCase(s.charAt(i)))
				l = true;
			else if (Character.isDigit(s.charAt(i)))
				d = true;
		}
		System.out.println(s.length() > 4 && u && l && d ? "Correct" : "Too weak");
	}
}
