import java.util.Scanner;

public class MinDifficulty {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], c = 0, d = 1001;
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();
		
		for (i = 1; i < n; i++)
			c = Math.max(c, a[i] - a[i - 1]);
		for (i = 1; i < n - 1; i++)
			d = Math.min(d, a[i + 1] - a[i - 1]);
		
		System.out.println(Math.max(c, d));
	}
}
