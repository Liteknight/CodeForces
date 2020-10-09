import java.util.Scanner;

public class SocNetE {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), i, j, id[] = new int[k], c = 0;

		for (i = 0; i < n; i++) {
			int m = in.nextInt();
			boolean b = true;

			for (j = 0; j < k; j++)
				if (id[j] == m)
					b = false;

			if (b) {
				for (j = k - 1; j > 0; j--)
					id[j] = id[j - 1];
				id[0] = m;
			}
		}
		in.close();
		String o = "";

		for (i = 0; i < k; i++)
			if (id[i] > 0) {
				o += id[i] + " ";
				c++;
			}
		System.out.println(c + "\n" + o);
	}
}
