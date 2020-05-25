import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiverseTeam {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, j = 0, l = 0;
		Set<Integer> s = new HashSet<Integer>();
		String y = "";

		for (i = 0; i < n; i++) {
			int x = in.nextInt();

			if (s.add(x) && l < k) {
				y += (j + 1) + " ";
				l++;
			}
			j++;
		}
		System.out.println(l >= k ? "YES" + "\n" + y : "NO");
		in.close();
	}
}
