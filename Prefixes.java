import java.util.Scanner;

public class Prefixes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, o = 0;
		String s = in.next();
		
		in.close();
		char[] c = s.toCharArray();

		for (i = 0; i < n; i += 2) {
			if (c[i] == c[i + 1]) {
				o++;
				
				if (c[i] == 'a') {
					c[i + 1] = 'b';
				} else {
					c[i] = 'a';
				}
			}
		}
		System.out.println(o);
		System.out.println(c);
	}
}
