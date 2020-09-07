import java.util.Scanner;

public class StrSimilar {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i;
			String s = in.next(), o = "";

			for (i = 0; i < n; i++) {
				o += s.charAt(n - 1);
			}
			System.out.println(o);
		}
		in.close();
	}
}
