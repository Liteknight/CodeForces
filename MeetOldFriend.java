import java.util.Scanner;

public class MeetOldFriend {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long l1 = in.nextLong(), r1 = in.nextLong(), l2 = in.nextLong(), r2 = in.nextLong(), k = in.nextLong(),
				l = Math.max(l1, l2), r = Math.min(r1, r2);

		in.close();
		System.out.println(l <= r ? k >= l && k <= r ? r - l : r - l + 1 : 0);
	}
}
