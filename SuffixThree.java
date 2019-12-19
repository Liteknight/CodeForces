import java.util.Scanner;

public class SuffixThree {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(), j;
				
		for (j=0; j<t; j++) {
			String str = sc.next();
			
			if (str.length() > 1 && str.substring(str.length()-2).equals("po")) {
				System.out.println("FILIPINO");
				
			} else if (str.length() > 4 && str.substring(str.length()-5).equals("mnida")) {
				System.out.println("KOREAN");
				
			} else {
				System.out.println("JAPANESE");
			}
		}
		sc.close();
	}
}