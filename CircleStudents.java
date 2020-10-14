import java.util.Scanner;

public class CircleStudents {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {
			
			int n = in.nextInt(), a[] = new int[n], i, c = 0;
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();
			
			for (i = 1; i < n; i++)
				if (Math.abs(a[i] - a[i - 1]) == 1 || Math.abs(a[i] - a[i - 1]) == n - 1)
					c++;
			System.out.println(c == n - 1 ? "YES" : "NO");
		}
		in.close();
	}
}
