import java.util.Scanner;

public class CodeUp1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		
		long ans = a;
		
		for(int i = 1; i < n ; i++) {
			ans = ans * r;
		}
		System.out.println(ans);
	}
}
