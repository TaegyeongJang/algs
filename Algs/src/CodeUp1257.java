import java.util.Scanner;

public class CodeUp1257 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int endNum = sc.nextInt();
		
		for(int i = firstNum; i <= endNum; ) {
			if (i % 2 == 0) {
				i += 1;
				continue;
			} else {
				System.out.println(i);
				i += 2;
			}
		}
	}
}
