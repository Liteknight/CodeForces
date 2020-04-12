import java.util.Scanner;

public class KefaFirstSteps {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, last = 0, max = 0, current = 0;

		for (i = 0; i < n; i++) {
			int a = in.nextInt();
			
			if (a >= last) {
				current++;				
				
				if (current > max) { max = current; }
				
			} else { current = 1; }
			last = a;
		}
		in.close();
		System.out.println(max);
	}
}
