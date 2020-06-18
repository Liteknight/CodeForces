import java.util.ArrayList;
import java.util.Scanner;

public class TeamOlympiad {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		ArrayList<Integer> a1 = new ArrayList<Integer>(), a2 = new ArrayList<Integer>(), a3 = new ArrayList<Integer>();

		for (i = 1; i <= n; i++) {
			int x = in.nextInt();

			if (x == 1) {
				a1.add(i);
			} else if (x == 2) {
				a2.add(i);
			} else if (x == 3) {
				a3.add(i);
			}
		}
		in.close();
		int min = Math.min(Math.min(a1.size(), a2.size()), a3.size());
		System.out.println(min);

		for (i = 0; i < min; i++) {
			System.out.println(a1.get(i) + " " + a2.get(i) + " " + a3.get(i));
		}
	}
}
