import java.util.Scanner;

public class ForgotEp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), a[] = new int[n], i;
		for (i = 0; i < n - 1; i++) {
			a[in.nextInt() - 1]++;
		}
		in.close();
		for (i = 0; i < n; i++) {
			if (a[i] == 0)
				System.out.println(i + 1);
		}
	}
}
