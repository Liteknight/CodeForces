import java.util.Scanner;

public class BrainsPhotos {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i;
		String o = "#Black&White";
		
		for (i = 0; i < n * m; i++) {
			String s=in.next();
			if (s.equals("C") || s.equals("M") || s.equals("Y")) {
				o = "#Color";
			}
		}
		in.close();
		System.out.println(o);
	}
}
