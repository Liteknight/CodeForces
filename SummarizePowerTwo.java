import java.util.HashMap;
import java.util.Scanner;

public class SummarizePowerTwo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, a[] = new int[n], c = 0;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			h.put(a[i], h.getOrDefault(a[i], 0) + 1);
		}
		in.close();
		for (i = 0; i < n; i++) {
			boolean b = false;

			for (j = 0; j < 32; j++) {
				int f = (1 << j) - a[i];

				if (h.containsKey(f) && (h.get(f) > 1 || (h.get(f) == 1 && f != a[i])))
					b = true;
			}
			if (!b)
				c++;
		}
		System.out.println(c);
	}
}
