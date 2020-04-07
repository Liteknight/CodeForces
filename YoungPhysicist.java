import java.util.Scanner;

public class YoungPhysicist {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, x = 0, y = 0, z = 0;

		for (i = 0; i < n; i++) {
			x += in.nextInt();
			y += in.nextInt();
			z += in.nextInt();
		}
		System.out.println(x == 0 && y == 0 && z == 0 ? "YES" : "NO");
		in.close();
	}
}
