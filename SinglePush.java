import java.util.Scanner;

public class SinglePush {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), i, a[] = new int[n], b[] = new int[n], c = 0, x = 0;

			for (i = 0; i < n; i++)
				a[i] = in.nextInt();
			for (i = 0; i < n; i++)
				b[i] = in.nextInt();

			for (i = 0; i < n; i++) {
				int d = b[i] - a[i];
				if (d != 0 && x != d) 
					c++;
				x = d;
				if (d < 0)
					c += 3;
			}
			System.out.println(c < 2 ? "YES" : "NO");
		}
		in.close();
	}
}
