import java.util.Scanner;

public class CU1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int [] arrC = new int[24]; // 배열의 크기를 확정적으로 잡아줘야 답이 나옴.
		for(int i = 0; i < arr.length; i++) {
			arrC[arr[i]]++;
		}
		
		for(int i = 1; i <= 23; i++) {
			System.out.print(arrC[i] + " ");
		}
	}
}