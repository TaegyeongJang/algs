import java.util.Scanner;

public class CodeUp1261 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			
			if(a % 5 == 0) {
				System.out.println(a);
				break;
			}
			if(i == 9) {
				System.out.println(0);
			}
			
		}
	}
}
