import java.util.Scanner;

public class CU1410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String len = sc.next();
		
		int cntL = 0;
		int cntR = 0;
		
		
		for(int i = 0 ; i < len.length(); i++) {
			if (len.charAt(i) == '(')
				cntL++;
			else
				cntR++;
		}
		System.out.println(cntL + " " + cntR);
	}
}
