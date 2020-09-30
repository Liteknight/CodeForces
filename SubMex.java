import java.util.Scanner;

public class SubMex {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), i, j = 0, k = 0, a[] = new int[101];
			for (i = 0; i < n; i++)
				a[in.nextInt()]++;

			while (a[j] > 0)
				a[j++]--;
			while (a[k] > 0)
				a[k++]--;

			System.out.println(j + k);
		}
		in.close();
	}
}
