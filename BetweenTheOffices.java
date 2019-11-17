import java.util.Scanner;

public class BetweenTheOffices {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, s_to_f, f_to_s, i;
		
		n = sc.nextInt();
		String str = sc.next();
		
		s_to_f = 0;
		f_to_s = 0;
		
		for (i=0; i<n-1; i++) {
			
			if ((str.charAt(i) + "" + str.charAt(i+1)).equals("SF")) {
				s_to_f++;
				
			} else if ((str.charAt(i) + "" + str.charAt(i+1)).equals("FS")) {
				f_to_s++;
			}
		}
		
		if (s_to_f > f_to_s) {
			System.out.println("YES");
			
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}