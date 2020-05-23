import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Panoramix {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		ArrayList<Integer> p = new ArrayList<Integer>(
				Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53));
		
		in.close();
		System.out.println(p.indexOf(m) - p.indexOf(n) == 1 ? "YES" : "NO");
	}
}
