import java.util.HashSet;
import java.util.Scanner;

public class ConnerARC {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt(), a = in.nextInt(), k = in.nextInt(), i;

			HashSet<Integer> h = new HashSet<Integer>();
			for (i = 0; i < k; i++)
				h.add(in.nextInt());

			for (i = 0; i < n; i++) {
				if (a + i <= n && !h.contains(a + i) || a - i > 0 && !h.contains(a - i)) {
					System.out.println(i);
					break;
				}
			}
		}
		in.close();
	}
}
