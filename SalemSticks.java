import java.util.Scanner;

public class SalemSticks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, a[] = new int[n], t = 1, o = Integer.MAX_VALUE;

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 1; i < 101; i++) {
			int s = 0;
			for (j = 0; j < n; j++) {

				if (Math.abs(a[j] - i) > 1)
					s += Math.abs(a[j] - i) - 1;
			}
			if (s < o) {
				o = s;
				t = i;
			}
		}
		System.out.println(t + " " + o);
	}
}
