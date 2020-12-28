import java.util.ArrayList;
import java.util.Scanner;

public class VasyaWrestling {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, l = 0;
		ArrayList<Integer> a = new ArrayList<Integer>(), b = new ArrayList<Integer>();
		long s1 = 0, s2 = 0;

		for (i = 0; i < n; i++) {
			int x = in.nextInt();

			if (x > 0) {
				s1 += x;
				a.add(x);
			} else {
				s2 -= x;
				b.add(-x);
			}
			if (i == n - 1)
				l = x;
		}
		in.close();

		if (s1 != s2) {
			System.out.println(s1 > s2 ? "first" : "second");
		} else {
			for (i = 0; i < Math.max(a.size(), b.size()); i++) {
				
				if (a.get(i) != b.get(i)) {
					System.out.println(a.get(i) > b.get(i) ? "first" : "second");
					return;
				}
			}
			System.out.println(l > 0 ? "first" : "second");
		}
	}
}
