import java.util.Scanner;

public class ArraySharp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, x = 0, y = n - 1;
			for (i = 0; i < n; i++) {
				int a = in.nextInt();

				if (a < i)
					y = Math.min(y, i - 1);
				if (a < n - i - 1)
					x = i + 1;
			}
			System.out.println(x <= y ? "Yes" : "No");
		}
		in.close();
	}
}
