import java.util.Scanner;

public class MoveBrackets {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			int n = in.nextInt();
			String s = in.next();
			
			while (n-- > 0) {
				s = s.replace("()", "");
			}
			System.out.println(s.length() / 2);
		}
		in.close();
	}
}
