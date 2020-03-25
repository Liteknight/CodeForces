import java.util.Scanner;

public class TheDoors {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, lastL = 0, lastR = 0;

		for (i = 0; i < n; i++) {
			int d = in.nextInt();
			
			if (d == 0) {
				lastL = i;
			} else {
				lastR = i;
			}
		}
		System.out.println(Math.min(lastL, lastR) + 1);
		in.close();
	}
}
