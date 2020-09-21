import java.util.Scanner;

public class FreeCashier {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, a[] = new int[2400], c = 0;
		for (i = 0; i < n; i++) {
			
			int h = in.nextInt(), m = in.nextInt();
			a[h * 100 + m]++;
			c = Math.max(c, a[h * 100 + m]);
		}
		in.close();
		System.out.println(c);
	}
}
