import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IWannaBeTheGuy {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), p1 = in.nextInt(), i = p1;

		ArrayList<Integer> a = new ArrayList<Integer>();
		String out = "I become the guy.";

		while (p1-- > 0) { a.add(in.nextInt()); }
		int p2 = in.nextInt();
		
		if (i == 0 && p2 == 0) {
			out = "Oh, my keyboard!";
			
		} else {
			while (p2-- > 0) { a.add(in.nextInt()); }
			Collections.sort(a);
			
			if (a.get(0) != 1) {
				out = "Oh, my keyboard!";
				
			} else {
				for (i = 0; i < a.size() - 1; i++) {

					if (a.indexOf(n) == -1 || a.get(i + 1) - a.get(i) > 1) {
						out = "Oh, my keyboard!";
						break;
					}
				}
			}
		}

		System.out.println(out);
		in.close();
	}
}
