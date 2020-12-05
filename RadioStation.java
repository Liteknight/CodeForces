import java.util.HashMap;
import java.util.Scanner;

public class RadioStation {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i;
		HashMap<String, String> a = new HashMap<String, String>();

		for (i = 0; i < n; i++) {
			String c = in.next(), ip = in.next();
			a.put(ip, c);
		}
		for (i = 0; i < m; i++) {
			String c = in.next(), ip = in.next();
			System.out.printf("%s %s #%s\n", c, ip, a.get(ip.substring(0, ip.length() - 1)));
		}
		in.close();
	}
}
