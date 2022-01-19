import java.util.Scanner;

public class CU1405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}

		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				if (j + k >= n)
					System.out.print(arr[j + k - n] + " ");
				else
					System.out.print(arr[j + k] + " ");

			}
			System.out.println();
		}


	}
}
