import java.util.Scanner;

public class DeclinedFinalists {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int k = in.nextInt(), m = 0, i;
		
		for (i = 0; i < k; i++) {
			m = Math.max(m, in.nextInt());
		}
		in.close();
		System.out.println(Math.max(m - 25, 0));
	}
}
