// 미완성
import java.util.Scanner;

public class CU1430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arrN = new int[N];
		
		for(int i = 0; i < N; i++) 
			arrN[i] = sc.nextInt();
		
		
		int M = sc.nextInt();

		
		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			int out = 0;
			
			for(int j : arrN) {
				if (j == num) {
					out = 1;
					break;
				}
				
			}
			System.out.print(out + " ");
			
		}
		
		
	}
}
