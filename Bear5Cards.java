import java.util.Scanner;

public class Bear5Cards {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t[] = new int[101], i, s = 0, o = 0;

		for (i = 0; i < 5; i++) {
			int x = in.nextInt();
			t[x]++;
			s += x;
		}
		in.close();
		o = s;
		for (i = 100; i > 0; i--) {
			if (t[i] > 1) {
				o = Math.min(o, s - Math.min(t[i], 3) * i);
			}
		}
		System.out.println(o);
	}
}
