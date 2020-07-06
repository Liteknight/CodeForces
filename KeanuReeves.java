import java.util.Scanner;

public class KeanuReeves {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, z = 0, o = 0;
		
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) == '0') {
				z++;
			} else {
				o++;
			}
		}
		System.out.println(z != o ? "1\n" + s : "2\n" + s.charAt(0) + " " + s.substring(1));
	}
}
