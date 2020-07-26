import java.util.HashSet;
import java.util.Scanner;

public class NastyaArray {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), c = 0;
		HashSet<Integer> a = new HashSet<Integer>();

		while (n-- > 0) {
			int x = in.nextInt();
			if (x != 0 && a.add(x)) {
				c++;
			}
		}
		in.close();
		System.out.println(c);
	}
}
