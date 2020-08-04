import java.util.Scanner;

public class MinBinaryNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String s = in.next(), o = "";
		in.close();

		for (i = 0; i < n; i++) {
			if (i == 0 && s.charAt(i) == '1') {
				o += "1";
			} else if (s.charAt(i) == '0') {
				o += "0";
			}
		}
		System.out.println(o);
	}
}
