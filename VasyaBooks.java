import java.util.Scanner;

public class VasyaBooks {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n + 1], l = -1;
		StringBuilder sb = new StringBuilder();

		for (i = 0; i < n; i++)
			a[in.nextInt()] = i;
		for (i = 0; i < n; i++) {
			int b = in.nextInt();

			if (a[b] <= l) {
				sb.append("0 ");
			} else {
				sb.append((a[b] - l) + " ");
				l = a[b];
			}
		}
		in.close();
		System.out.println(sb.toString());
	}
}