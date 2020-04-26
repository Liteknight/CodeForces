import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		HashMap<String, Integer> h = new HashMap<String, Integer>();

		for (i = 0; i < n; i++) {
			String s = in.next();

			if (h.containsKey(s)) {
				h.put(s, h.get(s) + 1);
				System.out.println(s + h.get(s));

			} else {
				h.put(s, 0);
				System.out.println("OK");
			}
		}
		in.close();
	}
}
