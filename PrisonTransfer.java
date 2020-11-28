import java.util.Scanner;

public class PrisonTransfer {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), t = in.nextInt(), c = in.nextInt(), i, a = 0, o = 0;
		for (i = 0; i < n; i++) {
			
			int p = in.nextInt();
			a = p <= t ? a + 1 : 0;
			if (a >= c)
				o++;
		}
		in.close();
		System.out.println(o);
	}
}
