import java.util.Scanner;

public class CU1380_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		for (int i = 1; i < k; i++) {

//			k=3; 1 2; 2 1; i/k-i
//			k=4; 1 3; 2 2; 3 1;
			if ((k-i > 6) || i > 6)
				continue;

			System.out.printf("%d %d\n", i, k - i);
		}
	}
}
