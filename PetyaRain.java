import java.util.Scanner;

public class PetyaRain {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n], m = 1;
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();

		in.close();
		for (i = 0; i < n; i++) {
			int c = 1, j = i, l = a[i];

			while (j-- > 0)
				if (a[j] <= l) {
					l = a[j];
					c++;
				} else {
					break;
				}
			j = i;
			l = a[i];

			while (j++ < n - 1)
				if (a[j] <= l) {
					l = a[j];
					c++;
				} else {
					break;
				}
			m = Math.max(m, c);
		}
		System.out.println(m);
	}
}
