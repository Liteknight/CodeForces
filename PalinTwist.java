import java.util.Scanner;

public class PalinTwist {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), i;
			String s = in.next(), o = "YES";
			for (i = 0; i < n; i++) {
				
				char c1 = s.charAt(i), c2 = s.charAt(n - i - 1), x = 0;
				if (c1 == c2 || c1 - 1 == c2 + 1 || c1 + 1 == c2 - 1)
					x = 1;
				if (x == 0)
					o = "NO";
			}
			System.out.println(o);
		}
		in.close();
	}
}
