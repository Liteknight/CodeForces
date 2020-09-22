import java.util.Scanner;

public class Books {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), t = in.nextInt(), i, a[] = new int[n + 1], s = 0, m = 0;

		for (i = 1; i <= n; i++) {
			int x = in.nextInt();
			a[i] = a[i - 1] + x;
			
			if (a[i] - a[s] > t)
				s++;
			m = Math.max(m, i - s);
		}
		in.close();
		System.out.println(m);
	}
}
