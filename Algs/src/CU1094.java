import java.util.Scanner;

public class CU1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n; i++) 
			arr[n-i-1] = sc.nextInt();
		
		for(int i : arr)
			System.out.print(i + " ");
	}
}
