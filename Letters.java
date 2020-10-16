import java.util.Scanner;

public class Letters {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, j = 1;
		
		long a[] = new long[n + 1];
		a[0] = 0;

		for (i = 1; i <= n; i++)
			a[i] = a[i - 1] + in.nextLong();

		for (i = 0; i < m; i++) {
			long b = in.nextLong();
			
			while (a[j] < b)
				j++;
			System.out.println(j + " " + (b - a[j - 1]));
		}
		in.close();
	}
}
