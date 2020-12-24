import java.util.Scanner;

public class ManyEqSubStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, r = 0;
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			if (s.substring(0, i).equals(s.substring(n - i)))
				r = i;
		}
		System.out.print(s);
		for (i = 0; i < k - 1; i++) {
			System.out.print(s.substring(r));
		}
	}
}
