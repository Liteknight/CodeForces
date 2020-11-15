import java.util.Scanner;

public class AsphaltRoads {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		boolean[] ha = new boolean[n], va = new boolean[n];

		for (i = 1; i <= Math.pow(n, 2); i++) {
			int h = in.nextInt() - 1, v = in.nextInt() - 1;

			if (ha[h] == false && va[v] == false) {
				ha[h] = true;
				va[v] = true;
				System.out.println(i + " ");
			}
		}
		in.close();
	}
}
