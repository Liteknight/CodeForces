import java.util.ArrayList;
import java.util.Scanner;

public class CardPairs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, s = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			
			a.add(x);
			s += x;
		}
		in.close();
		s /= (n / 2);

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (a.get(i) + a.get(j) == s && i != j) {
					System.out.println((i + 1) + " " + (j + 1));
					
					a.set(i, 0);
					a.set(j, 0);
				}
			}
		}
	}
}
