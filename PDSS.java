import java.util.Scanner;

public class PDSS {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s + sb.reverse());
	}
}
