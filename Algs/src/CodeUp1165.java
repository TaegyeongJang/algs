import java.util.Scanner;

public class CodeUp1165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int timeNow = sc.nextInt();
		int scoreNow = sc.nextInt();
		
		int scoreFinal = ((89 - timeNow) / 5) + scoreNow + 1;
		
		System.out.println(scoreFinal);
	}
}
