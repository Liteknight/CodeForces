import java.util.Scanner;

public class Opponents {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), d = in.nextInt(), m = 0, c = 0, i;
		
		while (d-- > 0) {
			String s = in.next();
			boolean p = true;
			
			for (i = 0; i < n; i++) {
				if (s.charAt(i) == '0') {
					p = false;
				}
			}
			if (!p) {
				c++;
				m = Math.max(m, c);
			} else {
				c = 0;
			}
		}
		in.close();
		System.out.println(m);
	}
}
