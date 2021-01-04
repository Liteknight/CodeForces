import java.util.Scanner;

public class TableTennis {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, c = -1;
		long k = in.nextLong();
		int w = in.nextInt();

		for (i = 1; i < n; i++) {
			int a = in.nextInt();
			if (w > a) {
				c++;
			} else {
				w = a;
				c = 0;
			}
			if (c >= k - 1)
				break;
		}
		in.close();
		System.out.println(w);
	}
}
