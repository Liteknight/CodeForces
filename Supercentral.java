import java.util.Scanner;

public class Supercentral {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], b[] = new int[n], i, c = 0;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {
			int l = 0, r = 0, u = 0, d = 0, j;
			for (j = 0; j < n; j++)
				if (i != j) {
					
					if (a[j] > a[i] && b[j] == b[i])
						l = 1;
					if (a[j] < a[i] && b[j] == b[i])
						r = 1;
					if (a[j] == a[i] && b[j] < b[i])
						u = 1;
					if (a[j] == a[i] && b[j] > b[i])
						d = 1;
				}
			if (l + r + u + d == 4)
				c++;
		}
		System.out.println(c);
	}
}
