import java.util.Scanner;

public class HongcowCyclicShift {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), t = s + s;

		in.close();
		System.out.println(t.indexOf(s, 1));
	}
}
