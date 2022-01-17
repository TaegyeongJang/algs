import java.util.Scanner;

public class BJ2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int j = i;
			while (j > 0) {
				System.out.print("*");
				j--;
			}
			System.out.println();
		}
	}
}
