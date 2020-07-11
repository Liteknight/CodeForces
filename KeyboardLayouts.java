import java.util.Scanner;

public class KeyboardLayouts {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String l1 = in.next(), l2 = in.next(), s = in.next();
		in.close();

		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				String c = s.substring(i, i + 1).toLowerCase();
				for (int j = 0; j < l1.length(); j++) {

					if (c.equals(l1.substring(j, j + 1))) {
						System.out.print(
								c.equals(s.substring(i, i + 1)) ? l2.charAt(j) : l2.substring(j, j + 1).toUpperCase());
					}
				}
			}
		}
	}
}
