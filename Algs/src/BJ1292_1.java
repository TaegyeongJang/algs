import java.util.Scanner;

public class BJ1292_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < a; i++) {
			if (sum > a) {
				System.out.println(i);
				break;
			}
			for (int j = 1; j <= i; j++)
				sum = sum + j * j;

		}
	}
}
