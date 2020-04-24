import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String g = in.next(), h = in.next(), p = in.next(), s = g + h;
		in.close();

		char[] sa = s.toCharArray(), pa = p.toCharArray();
		Arrays.sort(sa);
		Arrays.sort(pa);

		System.out.println(Arrays.equals(sa, pa) ? "YES" : "NO");
	}
}
