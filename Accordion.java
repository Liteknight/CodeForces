import java.util.Scanner;

public class Accordion {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char[] a = in.next().toCharArray();
		in.close();
		int c = 0, f = -5, o = -1, i;
		
		for (i = 0; i < a.length; i++)
			if (a[i] == '[')
				break;
		for (i = i + 1; i < a.length; i++)
			if (a[i] == ':')
				break;
		
		for (i = i + 1; i < a.length; i++) {
			if (a[i] == '|')
				c++;
			else if (a[i] == ':')
				f = c;
			else if (a[i] == ']')
				o = f + 4;
		}
		System.out.println(o);
	}
}
