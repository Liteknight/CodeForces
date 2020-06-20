import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Olympiad {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, w = 0;
		Set<Integer> s = new HashSet<Integer>();

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a != 0 && s.add(a)) {
				w++;
			}
		}
		in.close();
		System.out.println(w);
	}
}
