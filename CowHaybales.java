import java.util.Scanner;

public class CowHaybales {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int n = in.nextInt(), d = in.nextInt(), f = in.nextInt(), i;

			for (i = 1; i < n; i++) {
				int p = in.nextInt();
				
				while (d - i >= 0 && p > 0) {
					f++;
					d -= i;
					p--;
				}
			}
			System.out.println(f);
		}
		in.close();
	}
}
