import java.util.Scanner;

public class DZYHash {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int p = in.nextInt(), n = in.nextInt(), a[] = new int[p], i, o = -1;

		for (i = 0; i < n; i++) {
			int x = in.nextInt();
			a[x % p]++;
			
			if (a[x % p] > 1) {
				o = i + 1;
				break;
			}
		}
		in.close();
		System.out.println(o);
	}
}
