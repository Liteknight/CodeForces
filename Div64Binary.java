import java.util.Scanner;

public class Div64Binary {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), o = "no";
		in.close();

		int i, z = 0, j = s.indexOf('1');
		if (j > -1) {
			for (i = j; i < s.length(); i++) {
				
				if (s.charAt(i) == '0')
					z++;
				if (z >= 6) {
					o = "yes";
					break;
				}
			}
		}
		System.out.println(o);
	}
}
