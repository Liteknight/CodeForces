import java.util.HashSet;
import java.util.Scanner;

public class CommonSub {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int n = in.nextInt(), m = in.nextInt(), i,o = 0;
			HashSet<Integer> h = new HashSet<Integer>();

			for (i=0;i<n;i++) {
				h.add(in.nextInt());
			}
			for (i=0;i<m;i++) {
				int x = in.nextInt();
				if (h.contains(x)) {
					o = x;
				}
			}
			System.out.println(o > 0 ? "YES\n1 " + o : "NO");
		}
		in.close();
	}
}
