import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TanyaToys {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		long m = in.nextLong(), c = 0, j = 1;
		
		ArrayList<Long> al = new ArrayList<Long>();
		HashSet<Long> h = new HashSet<Long>();

		for (i = 0; i < n; i++)
			h.add(in.nextLong());
		in.close();

		while (m > 0) {
			if (m >= j) {
				if (!h.contains(j)) {
					al.add(j);
					m -= j;
					c++;
				}
			} else {
				m = 0;
			}
			j++;
		}
		System.out.println(c);
		for (i = 0; i < c; i++)
			System.out.print(al.get(i) + " ");
	}
}
