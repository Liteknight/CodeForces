import java.util.Scanner;

public class ZuhairStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), j, o = 0;
		String s = in.next();
		in.close();

		for (char i = 'a'; i <= 'z'; i++) {
			int x = 0, y = 0;
			for (j = 0; j < n; j++) {

				if (s.charAt(j) == i) {
					x++;
				} else {
					x = 0;
				}
				if (x >= k) {
					y++;
					x = 0;
				}
			}
			o = Math.max(o, y);
		}
		System.out.println(o);
	}
}
