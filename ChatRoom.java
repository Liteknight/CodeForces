import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		try {
			String h = s.substring(s.indexOf('h')), e = h.substring(h.indexOf('e')),
					l1 = e.substring(e.indexOf('l') + 1), l2 = l1.substring(l1.indexOf('l')),
					o = l2.substring(l2.indexOf('o'));
			System.out.println("YES");
			
		} catch (Exception e) {
			System.out.println("NO");
		}
		in.close();
	}
}
