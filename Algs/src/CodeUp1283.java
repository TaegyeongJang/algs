import java.util.Scanner;

public class CodeUp1283 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0 ; i < b ; i++) {
			double percent = (sc.nextInt() + 100) / 100.0;
			money = (int) Math.round(money * percent);
			System.out.println(percent);
			System.out.println(money);
		}
		System.out.printf("%.0f\n", money-10000);
		
		if(money > 10000) {
			System.out.print("good");
		} else if(money == 10000) {
			System.out.print("same");
		} else
			System.out.print("bad");
	}
}