import java.util.Scanner;

public class Inbox100500 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, d = 0, c = 0;
		boolean b = false;
		
		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			if (x == 1) {
				
				b = true;
				c += d == 0 ? 1 : 2;
				d = 0;
			} else if (b) {
				d++;
			}
		}
		in.close();
		System.out.println(c);
	}
}
