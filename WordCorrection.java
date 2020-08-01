import java.util.Scanner;

public class WordCorrection {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String s = in.next(), o = s.charAt(0) + "";
		in.close();

		for (i = 1; i < n; i++) {
			char c = s.charAt(i), cb = s.charAt(i - 1);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
				if (cb == 'a' || cb == 'e' || cb == 'i' || cb == 'o' || cb == 'u' || cb == 'y') {
					continue;
				}
			}
			o += c;
		}
		System.out.println(o);
	}
}
