import java.util.Scanner;

public class PermForgery {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, p[] = new int[n];
			for (i = 0; i < n; i++)
				p[i] = in.nextInt();

			for (i = n - 1; i >= 0; i--)
				System.out.print(p[i] + " ");
			System.out.println();
		}
		in.close();
	}
}
