import java.util.Scanner;

public class ElevatorStairs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), t1 = in.nextInt(), t2 = in.nextInt(),
				t3 = in.nextInt(), e = t3 * 3 + Math.abs(x - z) * t2 + Math.abs(x - y) * t2, s = Math.abs(x - y) * t1;
		
		in.close();
		System.out.println(e <= s ? "YES" : "NO");
	}
}
