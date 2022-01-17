import java.util.Scanner;

public class CodeUp1166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chkYear = sc.nextInt();
		
		if((chkYear % 4 == 0 && chkYear % 100 != 0) || chkYear % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
