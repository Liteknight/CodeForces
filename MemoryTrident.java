import java.util.Scanner;

public class MemoryTrident {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();

		if (s.length() % 2 == 1) {
			System.out.println(-1);
			return;
		}
		int a[] = new int[256], i;
		for (i = 0; i < s.length(); i++)
			a[s.charAt(i)]++;

		System.out.println((Math.abs(a['L'] - a['R']) + Math.abs(a['U'] - a['D'])) / 2);
	}
}
