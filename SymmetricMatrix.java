import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), m = in.nextInt(), c = 0, i;
			for (i = 0; i < n; i++) {
				
				in.nextInt();
				int x = in.nextInt(), y = in.nextInt();
				in.nextInt();
				
				if (x == y)
					c++;
			}
			System.out.println(c > 0 && m % 2 == 0 ? "YES" : "NO");
		}
		in.close();
	}
}
