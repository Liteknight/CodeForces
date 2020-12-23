import java.util.Scanner;

public class GoodString {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), i;
			String s = in.next();

			for (i = 0; i < n; i++) {
				if (s.charAt(i) == '>' || s.charAt(n - i - 1) == '<') {
					System.out.println(i);
					break;
				}
			}
		}
		in.close();
	}
}
