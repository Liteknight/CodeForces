import java.util.Scanner;

public class MishkaContest {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, j = n - 1, c = 0;
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		i = 0;
		while (i < n && a[i] <= k) {
			c++;
			i++;
		}
		while (j > 0 && j > i && a[j] <= k) {
			c++;
			j--;
		}
		System.out.println(c);
	}
}
