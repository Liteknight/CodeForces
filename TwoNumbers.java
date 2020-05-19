import java.util.ArrayList;
import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j;
		ArrayList<Integer> a = new ArrayList<Integer>(), b = new ArrayList<Integer>();

		for (i = 0; i < n; i++) {
			a.add(in.nextInt());
		}
		int m = in.nextInt();

		for (i = 0; i < m; i++) {
			b.add(in.nextInt());
		}
		in.close();		
		outerloop:
			
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {

				int s = a.get(i) + b.get(j);
				if (!a.contains(s) && !b.contains(s)) {
					
					System.out.println(a.get(i) + " " + b.get(j));
					break outerloop;
				}
			}
		}
	}
}
