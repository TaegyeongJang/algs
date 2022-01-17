import java.util.Scanner;

public class CodeUp1167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		max = (a > b) ? a : b;
		max = (c > max) ? c : max;
		
		int min = Integer.MAX_VALUE;
		min = (a > b) ? b : a;
		min = (c > min) ? min : c;
		
		System.out.println(a + b + c - max - min);
	}
}
