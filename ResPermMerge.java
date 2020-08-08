import java.util.HashSet;
import java.util.Scanner;

public class ResPermMerge {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), i;
			HashSet<Integer> h = new HashSet<Integer>();

			for (i = 0; i < n * 2; i++) {
				int a = in.nextInt();

				if (h.add(a)) {
					h.add(a);
					System.out.print(a + " ");
				}
			}
			System.out.println();
		}
		in.close();
	}
}
