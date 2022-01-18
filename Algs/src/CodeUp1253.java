import java.util.Scanner;

public class CodeUp1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long max = Long.max(a, b);
		long min = Long.min(a, b);
		
		for(long i = min; i <= max ; i++) {
			System.out.printf("%d ",i);
		}
		
		
	}
}
