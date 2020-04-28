import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriends {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		
		for (int i = 0; i < 3; i++) { a[i] = in.nextInt(); }
		in.close();
		
		Arrays.sort(a);		
		System.out.println(a[1] - a[0] + (a[2] - a[1]));
	}
}
