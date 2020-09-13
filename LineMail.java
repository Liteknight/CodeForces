import java.util.Scanner;

public class LineMail {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = in.nextInt();
		
		for (i = 0; i < n; i++) {
			int x = Math.max(a[n - 1] - a[i], a[i] - a[0]), y;
			if (i == 0) {
				y = a[i + 1] - a[i];
				
			} else if (i == n - 1) {
				y = a[i] - a[i - 1];
			} else {
				y = Math.min(a[i] - a[i - 1], a[i + 1] - a[i]);
			}
			System.out.println(y + " " + x);
		}
		in.close();
	}
}
