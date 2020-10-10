import java.util.Scanner;

public class GrasshopperStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), v = "AEIOUY";
		in.close();

		int i, c = 1, m = 1;
		for (i = 0; i < s.length(); i++) {
			
			if (v.contains(s.substring(i, i + 1))) {
				m = Math.max(m, c);
				c = 1;
			} else {
				c++;
			}
		}
		System.out.println(Math.max(m, c));
	}
}
