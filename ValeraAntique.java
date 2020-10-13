import java.util.Scanner;

public class ValeraAntique {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), v = in.nextInt(), i, c = 0;
		String o = "";
		
		for (i = 1; i <= n; i++) {
			int k = in.nextInt(), j, m = Integer.MAX_VALUE;
			
			for (j = 0; j < k; j++) {
				int x = in.nextInt();
				if (x < m)
					m = x;
			}
			if (m < v) {
				c++;
				o += i + " ";
			}
		}
		in.close();
		System.out.println(c + "\n" + o);
	}
}
