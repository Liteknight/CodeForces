import java.util.Scanner;

public class GameRobots {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt() - 1, i, a[] = new int[n];

		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		in.close();

		for (i = 1;; i++) {
			if (k < i) {
				break;
			}
			k -= i;
		}
		System.out.println(a[k]);
	}
}
