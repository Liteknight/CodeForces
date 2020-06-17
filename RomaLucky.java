import java.util.Scanner;

public class RomaLucky {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, j, o = 0;

		for (i = 0; i < n; i++) {
			String s = in.next();
			int c = 0;
			
			for (j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '4' || s.charAt(j) == '7') {
					c++;
				}
			}
			if (c <= k) {
				o++;
			}
		}
		in.close();
		System.out.println(o);
	}
}
