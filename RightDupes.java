import java.util.*;

public class RightDupes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		int[] a = new int[n];

		ArrayList<Integer> o = new ArrayList<Integer>();
		Set<Integer> s = new HashSet<Integer>();

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		for (i = n - 1; i >= 0; i--) {
			if (s.add(a[i])) {
				o.add(a[i]);
			}
		}
		Collections.reverse(o);
		System.out.println(o.size());
		
		for (int k : o) {
			System.out.print(k + " ");
		}
	}
}
