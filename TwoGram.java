import java.util.HashMap;
import java.util.Scanner;

public class TwoGram {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, m = 0;
		String s = in.next();
		in.close();

		HashMap<String, Integer> h = new HashMap<String, Integer>();
		for (i = 0; i < n - 1; i++) {
			String t = s.substring(i, i + 2);

			if (h.containsKey(t)) {
				h.put(t, h.get(t) + 1);
			} else {
				h.put(t, 1);
			}
		}
		for (int j : h.values())
			m = Math.max(m, j);

		for (i = 0; i < n - 1; i++) {
			String t = s.substring(i, i + 2);
			
			if (h.get(t) == m) {
				System.out.println(t);
				break;
			}
		}
	}
}
