import java.util.Scanner;

public class Dreamoon {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), x = in.nextInt(), i, a[] = new int[2000], v = 1;

			for (i = 0; i < n; i++)
				a[in.nextInt()]++;
			while (x > 0 || a[v] != 0) {
				if (a[v] == 0)
					x--;
				v++;
			}
			System.out.println(v - 1);
		}
		in.close();
	}
}
