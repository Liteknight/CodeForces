import java.util.Scanner;
import java.util.HashMap;

public class Lecture {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i;
		HashMap<String, String> s = new HashMap<String, String>();

		for (i = 0; i < m; i++) {
			String a = in.next(), b = in.next();
			
			if (a.length() > b.length()) {
				s.put(a, b);
			} else {
				s.put(a, a);
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(s.get(in.next()) + " ");
		}
		in.close();
	}
}
