import java.util.Scanner;

public class QueriesOnStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int m = in.nextInt();

		while (m-- > 0) {
			int l = in.nextInt() - 1, r = in.nextInt() - 1, k = in.nextInt() % (r - l + 1);
			
			s = s.substring(0, l) + s.substring(r - k + 1, r + 1) + s.substring(l, r - k + 1) + s.substring(r + 1);
		}
		System.out.println(s);
		in.close();
	}
}
