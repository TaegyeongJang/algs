import java.util.Scanner;

public class CU1411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		
		for(int i = 1; i < N; i++) {
			int ans = sc.nextInt();
			sum = sum - ans;
			
		}
		System.out.println(sum);
	}

}
