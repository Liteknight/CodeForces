import java.util.Scanner;

public class EqualizePrices {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		
		while (q-- > 0) {
			int n = in.nextInt(), i;
			double s = 0;
			
			for (i = 0; i < n; i++) {
				s += in.nextInt();
			}
			System.out.println((int) Math.ceil(s / n));
		}
		in.close();
	}
}
