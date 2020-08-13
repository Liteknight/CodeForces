import java.util.Scanner;

public class GiftFixing {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int n = in.nextInt(), a[] = new int[n], b[] = new int[n], i;
			long am = 1000000000, bm = 1000000000, m = 0;

			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				am = Math.min(am, a[i]);
			}
			for (i = 0; i < n; i++) {
				b[i] = in.nextInt();
				bm = Math.min(bm, b[i]);
			}
			for (i = 0; i < n; i++) {
				m += Math.max(a[i] - am, b[i] - bm);
			}
			System.out.println(m);
		}
		in.close();
	}
}
