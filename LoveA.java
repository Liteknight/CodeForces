import java.util.Scanner;

public class LoveA {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		boolean half = false;
		
		while (!half) {
			int count = 0;
			
			for (int i=0; i<s.length(); i++) {
				
				if (s.charAt(i) == 'a') {
					count++;
				}		
			}
			
			if (count > s.length()/2) {
				half = true;
			} else {
				String new_s = s.replaceFirst("[^a]", "");
				s = new_s;
			}
		}
		
		System.out.println(s.length());
		sc.close();
	}
}