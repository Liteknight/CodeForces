import java.util.Scanner;

public class ThreeStrings {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			String a = in.next(), b = in.next(), c = in.next(), o = "YES";

			for (int i = 0; i < c.length(); i++) {
				boolean same = a.charAt(i) == b.charAt(i) && a.charAt(i) == c.charAt(i),
						xor1 = c.charAt(i) == a.charAt(i) && c.charAt(i) != b.charAt(i),
						xor2 = c.charAt(i) == b.charAt(i) && c.charAt(i) != a.charAt(i);

				if (!(same || xor1 || xor2)) {
					o = "NO";
					break;
				}
			}
			System.out.println(o);
		}
		in.close();
	}
}
