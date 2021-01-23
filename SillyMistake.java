import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SillyMistake {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, s = 0;
		List<Integer> o = new ArrayList<Integer>();
		Set<Integer> u = new HashSet<Integer>();

		for (i = 0; i < n; i++) {
			int a = in.nextInt();

			if (a < 0 && !u.contains(-a) || a > 0 && u.contains(a)) {
				System.out.println(-1);
				return;
			}
			u.add(a);
			s += a;
			if (s == 0) {
				o.add(u.size());
				u.clear();
			}
		}
		in.close();
		if (s == 0) {
			System.out.println(o.size());
			
			for (int j : o)
				System.out.print(j + " ");
		} else
			System.out.println(-1);
	}
}
