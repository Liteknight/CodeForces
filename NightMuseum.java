import java.util.Scanner;

public class NightMuseum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		char l = 'a';
		int c = 0, i;

		for (i = 0; i < s.length(); i++) {

			char x = Character.toLowerCase(l), y = Character.toLowerCase(s.charAt(i));
			int d = Math.abs(x - y);
			
			c += Math.min(d, 26 - d);
			l = y;
		}
		System.out.println(c);
	}
}
