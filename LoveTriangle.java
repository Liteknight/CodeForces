import java.util.Scanner;

public class LoveTriangle {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] a = new int[n];
		String o = "NO";

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		for (i = 0; i < n; i++) {
			
			int a1 = a[i] - 1, a2 = a[a1] - 1, a3 = a[a2] - 1;
			if (a3 == i) {
				o = "YES";
			}
		}
		System.out.println(o);
	}
}
