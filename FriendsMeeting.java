import java.util.Scanner;

public class FriendsMeeting {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), x1 = Math.min(a, b), x2 = Math.max(a, b), m = 1, t = 0;
		while (x1 != x2) {
			x1++;
			t += m;
			if (x1 != x2) {
				x2--;
				t += m;
			}
			m++;
		}
		in.close();
		System.out.println(t);
	}
}
