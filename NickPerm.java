import java.util.Scanner;

public class NickPerm {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, min = n, max = 0, mini = 0, maxi = 0;

		for (i = 0; i < n; i++) {
			int x = in.nextInt();

			if (x > max) {
				max = x;
				maxi = i;
			}
			if (x < min) {
				min = x;
				mini = i;
			}
		}
		in.close();
		System.out.println(Math.max(n - Math.min(maxi, mini) - 1, Math.max(maxi, mini)));
	}
}
