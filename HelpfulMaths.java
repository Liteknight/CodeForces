import java.util.Scanner;

public class HelpfulMaths {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next(), str="";
		int one = 0, two = 0, three = 0, i;

		for (i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == '1') { one++; }
			else if (s.charAt(i) == '2') { two++; }
			else if (s.charAt(i) == '3') { three++; }
		}
		for(i=0;i<one;i++) { str += "+1"; }
		for(i=0;i<two;i++) { str += "+2"; }
		for(i=0;i<three;i++) { str += "+3"; }
		
		System.out.println(str.substring(1));
		in.close();
	}
}
