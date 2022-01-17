import java.util.Scanner;

public class BJ11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		
		for (int i = 1; i <= caseNum; i++) {
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d", i, firstNum, secondNum, firstNum + secondNum);
		}
	}
}
