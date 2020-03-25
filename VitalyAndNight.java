import java.util.Scanner;

public class VitalyAndNight {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i, awakes = 0;

		for (i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				boolean awake = false;
				
				for (int k = 0; k < 2; k++) {
				
					if (in.nextInt() == 1) { awake = true; }
				}
				if (awake) { awakes++; }
			}
		}
		System.out.println(awakes);
		in.close();
	}
}
