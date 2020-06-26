import java.util.Scanner;

public class ShortSubs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			String s = in.next();
			System.out.print(s.charAt(0));

			for (int i = 1; i < s.length(); i += 2) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
		in.close();
	}
}
