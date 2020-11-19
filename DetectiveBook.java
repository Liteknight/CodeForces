import java.util.Scanner;

public class DetectiveBook {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n + 1], c = 0, t = 0;
		
		for (i = 1; i <= n; i++) {
			int x = in.nextInt();
			a[x]++;
			c++;
			c -= a[i];
			if (c == 0) {
				t++;
			}
		}
		in.close();
		System.out.println(t);
	}
}
